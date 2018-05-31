package vsim.riscv.isa.instructions.itype;


public final class Srli extends IType {

    @Override
    protected int compute(int rs1, int imm) {
        return rs1 >>> (imm & 0x1f);
    }

}