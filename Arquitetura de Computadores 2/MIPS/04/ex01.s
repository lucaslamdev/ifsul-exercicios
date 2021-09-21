.data
	msg1: .asciiz "\nDigite um numero inteiro: " 
    msg2: .asciiz "\nO Resultado da Soma: " 
    vetor: .align 2 
           .space 20

.text

.globl main

main: 
    li $t0, 0 

preencherVetor:
    beq $t0, 20, vetorPreenchido

    li $v0, 4
    la $a0, msg1 
    syscall 

    li $v0, 5
    syscall
    move $t1, $v0

    sw $t1, vetor($t0)

    add $t0, $t0, 4

    j preencherVetor

vetorPreenchido:
    li $t0, 0
    li $t1, 0 
    li $t2, 0
    
somarValores:
    beq $t0, 20, resultadoSoma
    
    lw $t1, vetor($t0)
    add $t2, $t2, $t1

    add $t0, $t0, 4

    j somarValores

resultadoSoma:

    li $v0, 4
    la $a0, msg2
    syscall 

    li $v0, 1
    move $a0, $t2
    syscall

    li $v0, 10
	syscall