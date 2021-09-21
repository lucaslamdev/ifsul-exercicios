.data
	msg1: .asciiz "\nDigite um numero inteiro: " 
    msg2: .asciiz "\nO maior número é: " 
    vetor: .align 2
           .space 16

.text
.globl main

main: 
    li $t0, 0

preencherVetor:
    beq $t0, 16, vetorPreenchido

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
    
verValores:
    beq $t0, 16, resultadoMaiorNumero
    
    lw $t1, vetor($t0)

    add $t0, $t0, 4

    bge $t1, $t2, maiorValor

    j verValores

maiorValor:
    move $t2, $t1
    j verValores

resultadoMaiorNumero:

    li $v0, 4
    la $a0, msg2
    syscall 

    li $v0, 1
    move $a0, $t2
    syscall

    li $v0, 10
	syscall