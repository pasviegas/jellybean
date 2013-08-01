package in.com.tw.jellybean.models;

public class Assignment {
    private Slot slot;
    private Consultant consultant;

    public AssignmentStatus getAssignmentStatus() {
        return assignmentStatus;
    }

    public void setAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    private AssignmentStatus assignmentStatus;

    public Assignment(Slot slot, Consultant consultant) {
        this.slot = slot;
        this.consultant = consultant;
    }

    public Slot getSlot() {
        return slot;
    }

    public Consultant getConsultant() {
        return consultant;
    }
}
