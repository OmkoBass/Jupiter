.globl main

.text

main:
  li x1, 0x00000003
  li x2, 0x00000007
  add x30, x1, x2
  li x29, 0x0000000a
  bne x30, x29, fail

sucess:
  li a0, 10
  ecall

fail:
  li a0, 17
  li a1, 1
  ecall