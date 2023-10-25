package ch08;

import ch07.News;
import ch07.NewsDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

@Path("/news")
public class NewsApiService {
  NewsDAO newsDAO;
  public NewsApiService() {
    newsDAO = new NewsDAO();
  }
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public String addNews(News news){ //== String title, img, ...
    String result = "";
    try {
      newsDAO.addNews(news);
      result = "news api : 뉴스 등록 성공";
    } catch (SQLException e) {
      e.printStackTrace();
      result = "news api : 뉴스 등록 실패";
    }
    return result;
  }

//  @GET
//  @Path("{aid}")
//  @Produces(MediaType.APPLICATION_JSON)
//  public News getNews(@PathParam("aid") int aid) {
//    String result = "";
//    News news = null;
//    try {
//      newsDAO.getNews(news);
//      result = "news api : 뉴스 등록 성공";
//    } catch (SQLException e) {
//      e.printStackTrace();
//      result = "news api : 뉴스 등록 실패";
//    }
//    return result;
//  }
}
