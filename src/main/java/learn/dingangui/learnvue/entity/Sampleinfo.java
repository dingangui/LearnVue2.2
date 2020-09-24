package learn.dingangui.learnvue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sampleinfo {

  @Id
  private Integer id;
  private String patientname,sex,age;

}
