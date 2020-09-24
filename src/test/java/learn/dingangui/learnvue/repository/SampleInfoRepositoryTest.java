package learn.dingangui.learnvue.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleInfoRepositoryTest {

  @Autowired
  private SampleInfoRepository sampleInfoRepository;

  @Test
  void findAll(){
    System.out.println(sampleInfoRepository.findAll());
  }
}