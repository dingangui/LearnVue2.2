package learn.dingangui.learnvue.repository;

import learn.dingangui.learnvue.entity.Sampleinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleInfoRepository extends JpaRepository<Sampleinfo,Integer> {
}
