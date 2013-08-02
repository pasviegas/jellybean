package in.com.tw.jellybean.dao;

import in.com.tw.jellybean.models.Position;
import in.com.tw.jellybean.models.project.Project;

import java.util.Arrays;
import java.util.List;

public class ProjectCapacityDao {
    public List<Position> getOpenPositions(Project project) {
        return Arrays.asList(new Position[]{new Position(), new Position()});  //To change body of created methods use File | Settings | File Templates.
    }

    public List<Position> getAllOpenPositions() {
        return Arrays.asList(new Position[]{new Position(), new Position()});  //To change body of created methods use File | Settings | File Templates.
    }
}
