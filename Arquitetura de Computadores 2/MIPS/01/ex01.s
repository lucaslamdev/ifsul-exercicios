.data
    msg1: .asciiz "\nDigite o primeiro n�mero inteiro: "
    msg2: .asciiz "\nDigite o segundo n�mero inteiro: "
    msg3: .asciiz "\nDigite o terceiro n�mero inteiro: "
    msg4: .asciiz "\nA soma dos n�meros �: "

.text

.globl main

main:
    li $v0, 4
    la $a0, msg1 
    syscall 

    li $v0, 5
    syscall
    move $t0, $v0

    li $v0, 4
    la $a0, msg2 
    syscall 

    li $v0, 5
    syscall
    move $t1, $v0

    li $v0, 4
    la $a0, msg3 
    syscall 

    li $v0, 5
    syscall
    move $t2, $v0

    add $t0, $t1, $t0
    add $t0, $t2, $t0 

    li $v0, 4
    la $a0, msg4 
    syscall 

    li $v0, 1
    move $a0, $t0
    syscall 

    li $v0, 10
	syscall