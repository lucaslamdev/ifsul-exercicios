.data
	msg1: .asciiz "\nDigite uma senha numérica: "
    msgmaior: .asciiz "\nA senha é maior q o número digitado! "
    msgmenor: .asciiz "\nA senha é menor q o número digitado! "
    msgacertou: .asciiz "\nParabéns você acertou a senha!"
.text

.globl main

main:
    SENHA=123
    li $t0, 0
    

loopwhile:
    li $v0, 4
    la $a0, msg1 
    syscall 

    li $v0, 5
    syscall
    move $t1, $v0

    beq $t1, SENHA, acertou
    bgt $t1, SENHA, maior
    blt $t1, SENHA, menor

    j loopwhile

maior:
    li $v0, 4
    la $a0, msgmaior 
    syscall
    j loopwhile 

menor:
    li $v0, 4
    la $a0, msgmenor 
    syscall
    j loopwhile

acertou:
    li $v0, 4
    la $a0, msgacertou
    syscall 

    li $v0, 10
	  syscall
