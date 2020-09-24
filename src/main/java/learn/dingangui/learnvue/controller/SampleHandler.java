package learn.dingangui.learnvue.controller;

import learn.dingangui.learnvue.entity.Sampleinfo;
import learn.dingangui.learnvue.repository.SampleInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sample")
public class SampleHandler {
  @Autowired
  private SampleInfoRepository sampleInfoRepository;

  @GetMapping("/findAll")
  public List<Sampleinfo> findAll(){
    return sampleInfoRepository.findAll();
  };

}
