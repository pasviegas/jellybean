package in.com.tw.jellybean.services;

import in.com.tw.jellybean.models.project.Project;
import in.com.tw.jellybean.models.Slot;
import java.util.List;

public interface ProjectCapacityService {

    List<Slot> getOpenSlots(Project project);
    List<Slot> getAllOpenSlots();
}
