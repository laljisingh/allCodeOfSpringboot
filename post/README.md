# Simple Post API

In this project i am creating a simple project just showing, how to deploy our project on AWS account

## Project Links

[GitHub Links](https://github.com/laljisingh/allCodeOfSpringboot/tree/main/post)

[Live Project Links](http://3.143.239.143:8080/swagger-ui.html)

### Mudules In Projects
#### Controller
* Add Post
* Delete Post
* Get Post

### MVC Mules in app
- Repository
- Controller
- service
- Model

### Account Using
- AWS Account.

### DataBase
- MySql DataBase



#### Controller Codes
- @RestController
  public class PostController {
  @Autowired
  PostService postService;
  @PostMapping("/post/add")
  public String addPost(@RequestBody Post post){
  postService.addPost(post);
  return post.toString();
  }
  @GetMapping("/get-post")
  public ResponseEntity<String> getPost(){
  List<Post> post = postService.getPost();
  return new ResponseEntity<String>(post.toString(), HttpStatus.OK);
  }
  @DeleteMapping("/delete/{id}")
  public String deletePost(@PathVariable Integer id){
  postService.deletePost(id);
  return "deleted";
  }
  }



#                    Thanks