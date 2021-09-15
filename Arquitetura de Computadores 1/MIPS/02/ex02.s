.data
	msg1: .asciiz "\n"

.text
.globl main

main:
    li $t0, 10

loopfor:
    beq $t0, -1 saida
    
    li $v0, 1
    move $a0, $t0 
    syscall

    li $v0, 4
    la $a0, msg1
    syscall

    sub $t0, $t0, 1

    j loopfor

saida:
    li $v0, 10
	syscall