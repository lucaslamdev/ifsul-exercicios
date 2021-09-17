.data
	msg1: .asciiz "\nInforme n números inteiros deseja somar: "
    msgsoma: .asciiz "+"
    msgfinal: .asciiz "\nA soma de todos números inteiros é: "
.text
.globl main

main:
    li $t0, 0
    li $t3, 0

    li $v0, 4
    la $a0, msg1 
    syscall 

    li $v0, 5
    syscall
    move $t1, $v0


loopfor:
    bgt $t0, $t1 saida
    
    li $v0, 1
    move $a0, $t0 
    syscall

    add $t3, $t0, $t3

    blt $t0, $t1 sinalsoma

    addi $t0, $t0, 1
    j loopfor

sinalsoma:
    li $v0, 4
    la $a0, msgsoma
    syscall

    addi $t0, $t0, 1
    j loopfor

saida:
    li $v0, 4
    la $a0, msgfinal
    syscall 

    li $v0, 1
    move $a0, $t3 
    syscall

    li $v0, 10
	syscall