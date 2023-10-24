package ch07;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class News {
  private int aid;
  private String title;
  private String img;
  private String date;
  private String content;
}
