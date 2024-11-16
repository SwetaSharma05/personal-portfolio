<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Personal Portfolio Website</title>
    <link rel="stylesheet" href="style3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/typed.js/2.0.11/typed.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css"/>
</head>
<body>
    <div class="scroll-up-btn">
        <i class="fas fa-angle-up"></i>
    </div>
    <nav class="navbar">
        <div class="max-width">
            <div class="logo"><a href="#">Portfo<span>lio</span></a></div>
            <ul class="menu">
                <li><a href="#home" class="menu-btn">Home</a></li>
                <li><a href="#about" class="menu-btn">About</a></li>
                <li><a href="#services" class="menu-btn">Services</a></li>
                <li><a href="#skills" class="menu-btn">Skills</a></li>
                <li><a href="#teams" class="menu-btn">Projects</a></li>
                <li><a href="#contact" class="menu-btn">Contact</a></li>
            </ul>
            <div class="menu-btn">
                <i class="fas fa-bars"></i>
            </div>
        </div>
    </nav>
    <!-- home section start -->
    <section class="home" id="home">
        <div class="max-width">
            <div class="home-content">
                <div class="text-1">Hello, my name is</div>
                <div class="text-2">Sweta Sharma</div>
                <div class="text-3">And I'm a <span class="typing"></span></div>
                <a href="#">Hire me</a>
            </div>
        </div>
    </section>
    <!-- about section start -->
    <section class="about" id="about">
        <div class="max-width">
            <h2 class="title">About me</h2>
            <div class="about-content">
                <div class="column left">
                    <img src="uniform.jpeg" alt="">
                </div>
                <div class="column right">
                    <div class="text">I'm Sweta and I'm a <span class="typing-2"></span></div>
                    <p>With a solid foundation in programming languages such as Python, C++, and Java, experience in front-end development using HTML, CSS, JavaScript. Knowledge of machine learning includes the basics of Natural Language Processing (NLP), Computer Vision (CV), and Generative AI. Additionally, there is a comprehensive understanding of data structures and algorithms, object-oriented programming, and software design principles.</p>
                    <a href="#">Download CV</a>
                </div>
            </div>
        </div>
    </section>
    <!-- services section start -->
    <section class="services" id="services">
        <div class="max-width">
            <h2 class="title">My services</h2>
            <div class="serv-content">
                <div class="card">
                    <div class="box">
                        <i class="fas fa-paint-brush"></i>
                        <div class="text">Web Design</div>
                        <p> I am currently learning web development through HTML , CSS & JavaScript.</p>
                    </div>
                </div>
                <div class="card">
                    <div class="box">
                        <i class="fas fa-chart-line"></i>
                        <div class="text">Data Structures</div>
                        <p>I have a good hand in Data Structures and Algorithm and a good knowledge in its theory</p>
                    </div>
                </div>
                <div class="card">
                    <div class="box">
                        <i class="fas fa-code"></i>
                        <div class="text">UI/UX Design</div>
                        <p>I have a good knowledge about UI design and its work process .</p>
                    </div>
                </div>
               </div>
            </div>
        </div>
    </section>
    <!-- skills section start -->
    <section class="skills" id="skills">
        <div class="max-width">
            <h2 class="title">My skills</h2>
            <div class="skills-content">
                <div class="column left">
                    <div class="text">My creative skills & experiences.</div>
                    <p> I love to solve real time problem.I always search for the new oppurtunities to learn different things to enhance my skillset.Always open for new projects.</p>
                    <a href="#">Read more</a>
                </div>
                <div class="column right">
                    <div class="bars">
                        <div class="info">
                            <span>HTML</span>
                            <span>90%</span>
                        </div>
                        <div class="line html"></div>
                    </div>
                    <div class="bars">
                        <div class="info">
                            <span>CSS</span>
                            <span>60%</span>
                        </div>
                        <div class="line css"></div>
                    </div>
                    <div class="bars">
                        <div class="info">
                            <span>Java</span>
                            <span>80%</span>
                        </div>
                        <div class="line js"></div>
                    </div>
                    <div class="bars">
                        <div class="info">
                            <span>JavaScript</span>
                            <span>50%</span>
                        </div>
                        <div class="line php"></div>
                    </div>
                    <div class="bars">
                        <div class="info">
                            <span>Data Structure</span>
                            <span>70%</span>
                        </div>
                        <div class="line mysql"></div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- teams section start -->
    <section class="teams" id="teams">
        <div class="max-width">
            <h2 class="title">My Projects</h2>
            <div class="carousel owl-carousel">
                <div class="card">
                    <div class="box">
                        <img src="netflix.jpg" alt="">
                        <div class="text">Netflix Clone</div>
                        <p>I have made this Netflix Clone using HTML & CSS.</p>
                        <a href="https://github.com/SwetaSharma05/netflix-clone/tree/main">
                            <i class="fa-brands fa-github"></i> View on GitHub
                        </a>
                    </div>
                </div>
                <div class="card">
                    <div class="box">
                        <img src="movie.jpg" alt="">
                        <div class="text">Movie App</div>
                        <p>I have made this amazing Movie App using HTML , Bootstrap , API & React.JS.</p>
                    </div>
                </div>
                <div class="card">
                    <div class="box">
                        <img src="linkedin.jpg" alt="">
                        <div class="text">Linkedin Automation</div>
                        <p>I have made this Project using JavaScript & Puppeteer Node library</p>
                    </div>
                </div>
                <div class="card">
                    <div class="box">
                        <img src="port.jpg" alt="">
                        <div class="text">Portfolio Website</div>
                        <p>I have made this Project using HTML , CSS and JavaScript</p>
                        
                    </div>
                </div>
                <div class="card">
                    <div class="box">
                        <img src="music.jpg" alt="">

                        <div class="text">Music Player</div>
                        <p>I have made this Double linkedin list of Data Structure And Algorithms</p>
                        <a href="https://github.com/SwetaSharma05/musicplayer/blob/main/music%20playlist">
                            <i class="fa-brands fa-github"></i> View on GitHub
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- contact section start -->
    <section class="contact" id="contact">
        <div class="max-width">
            <h2 class="title">Contact me</h2>
            <div class="contact-content">
                <div class="column left">
                    <div class="text">Get in Touch</div>
                    <p>Thank you for visiting out my profile. If you would like to get into contact with me, please fill out the form below. or mail me at sweta3925sharma@gmail.com</p>
                    <div class="icons">
                        <div class="row">
                            <i class="fas fa-user"></i>
                            <div class="info">
                                <div class="head">Name</div>
                                <div class="sub-title">Sweta Sharma</div>
                            </div>
                        </div>
                        <div class="row">
                            <i class="fas fa-map-marker-alt"></i>
                            <div class="info">
                                <div class="head">Address</div>
                                <div class="sub-title">Pune,Maharashtra</div>
                            </div>
                        </div>
                        <div class="row">
                            <i class="fas fa-envelope"></i>
                            <div class="info">
                                <div class="head">Email</div>
                                <div class="sub-title">sweta3925sharma@gmail.com</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="column right">
                    <div class="text">Message me</div>
                    <form action="#">
                        <div class="fields">
                            <div class="field name">
                                <input type="text" placeholder="Name" required>
                            </div>
                            <div class="field email">
                                <input type="email" placeholder="Email" required>
                            </div>
                        </div>
                        <div class="field">
                            <input type="text" placeholder="Subject" required>
                        </div>
                        <div class="field textarea">
                            <textarea cols="30" rows="10" placeholder="Message.." required></textarea>
                        </div>
                        <div class="button-area">
                            <button type="submit">Send message</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
    <!-- footer section start -->
    <footer>
        <span>Created By <a>Sweta Sharma</a> | <span class="far fa-copyright"></span> 2024 All rights reserved.</span>
    </footer>
    <script src="script3.js"></script>
</body>
</html>
