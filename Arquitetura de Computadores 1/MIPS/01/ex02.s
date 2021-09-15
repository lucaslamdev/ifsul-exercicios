.data
    msg1: .asciiz "\nDigite o primeiro número inteiro: "
    msg2: .asciiz "\nDigite o segundo número inteiro: "
    msg3: .asciiz "\nO número maior é o: "

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

    bge $t0, $t1 t0maior
    bge $t1, $t0 t1maior  

t0maior:
    move $t2, $t0
    j imprimir

t1maior:
    move $t2, $t1
    j imprimir

imprimir:
    li $v0, 1
    move $a0, $t2
    syscall     

    li $v0, 10
	syscall