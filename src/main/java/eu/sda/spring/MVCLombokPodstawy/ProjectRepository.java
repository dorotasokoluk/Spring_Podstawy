package eu.sda.spring.MVCLombokPodstawy;

import eu.sda.spring.MVCLombokPodstawy.model.Project;
import lombok.Builder;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class ProjectRepository {
    public List<Project> getProjects(){
        return Arrays.asList(
                Project.builder()
                        .name("pierwszy")
                        .team(1)
                        .startDate(new Date())
                .build()
                ,
                Project.builder()
                        .name("drugi")
                        .team(2)
                        .startDate(new Date())
                        .build()
                ,
                Project.builder()
                        .name("trzeci")
                        .team(3)
                        .startDate(new Date())
                        .build()
                ,
                Project.builder()
                        .name("czwarty")
                        .team(4)
                        .startDate(new Date())
                        .build()
        );


    }

}
