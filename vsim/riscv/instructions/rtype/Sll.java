package vsim.riscv.instructions.rtype;


public final class Sll extends RType {

  public Sll() {
    super(
      "sll",
      "sll rd, rs1, rs2",
      "set rd = rs1 << rs2[0:4], logical shift left"
    );
    // set opcode
    this.opcode = 0b0110011;
    this.funct3 = 0b001;
    this.funct7 = 0b0000000;
  }

  @Override
  protected int compute(int rs1, int rs2) {
    return rs1 << (rs2 & 0x1f);
  }

}