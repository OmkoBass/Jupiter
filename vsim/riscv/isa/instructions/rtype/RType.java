package vsim.riscv.isa.instructions.rtype;

import vsim.Globals;
import vsim.riscv.hardware.Register;
import vsim.riscv.isa.instructions.Code;
import vsim.riscv.isa.instructions.SimCode;


public abstract class RType extends SimCode {

    protected abstract int compute(int rs1, int rs2);

    @Override
    public void execute(Code code) {
        Register rs1 = Globals.regfile.getRegister(code.getRs1());
        Register rs2 = Globals.regfile.getRegister(code.getRs2());
        Register rd = Globals.regfile.getRegister(code.getRd());
        rd.setValue(this.compute(rs1.getValue(), rs2.getValue()));
    }

}