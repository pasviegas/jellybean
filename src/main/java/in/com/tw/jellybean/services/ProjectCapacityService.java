package in.com.tw.jellybean.services;

import in.com.tw.jellybean.models.Position;
import in.com.tw.jellybean.models.project.Project;

import java.util.List;

public interface ProjectCapacityService {

    List<Position> getOpenPositions(Project project);
    List<Position> getAllOpenPositions();
}
