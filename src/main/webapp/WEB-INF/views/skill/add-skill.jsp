<%@include file="../dynamic/head.jspf"%>
<%@ page contentType="text/html; charset=UTF-8" %>

  <!-- ======= Mobile nav toggle button ======= -->
  <button type="button" class="mobile-nav-toggle d-xl-none"><i class="icofont-navigation-menu"></i></button>

  <!-- ======= Header ======= -->
  <header id="header" class="d-flex flex-column justify-content-center">

    <nav class="nav-menu">
      <ul>
        <li class="active"><a href=""><i class="bx bx-home"></i> <span>Główna</span></a></li>
        <!-- <li><a href="#about"><i class="bx bx-user"></i> <span>O mnie</span></a></li> -->
        <!-- <li><a href="#resume"><i class="bx bx-file-blank"></i> <span>CV</span></a></li> -->
        <li><a href="admin"><i class="fas fa-users-cog"></i> <span>Admin</span></a></li>
        <!-- <li><a href="#services"><i class="bx bx-server"></i> <span>Services</span></a></li> -->
        <!-- <li><a href="#contact"><i class="bx bx-envelope"></i> <span>Contact</span></a></li> -->
      </ul>
    </nav><!-- .nav-menu -->

  </header><!-- End Header -->


  <main id="main">

    <!-- ======= Skills Section ======= -->
    <section id="skills" class="skills section-bg">
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2>Dodaj Umiejętność</h2>
          <p>Wpisz nazwę skilla, wartość i zatwierdź</p>
        </div>

        <div class="row skills-content">

          <div class="col-lg-12">

            <form name="postSaveSkill" method="post" action="saveSkill" modelAttribute="skill">
              <div class="col-lg-12">
                <div class="row">
                  <div class="col-lg-1">
                    <label for="SkillName" class="col-2 col-form-label">Nazwa</label>
                  </div>
                  <div class="col-lg-4">
                    <input class="form-control" name="skillName" id="SkillName" type="text">
                  </div>
                  <div class="col-lg-2">
                    <label for="Level" class="col-2 col-form-label">Poziom (1-100)</label>
                  </div>
                  <div class="col-lg-2">
                    <input class="form-control" name="level" id="Level" type="number" min="1" max="100">
                  </div>
                </div>
                <br>
              </div>


              <br>

              <div class="row">
                <div class="col-lg-2">
                  <button type="submit"> <a class="skill-button"> <i class="fas fa-list-ul"> </i> <span>Zapisz</span></a>
                  </button>
                </div>
              </div>



            </form>






            


          </div>

        </div>

      </div>
    </section><!-- End Skills Section -->


  
  
  </main><!-- End #main -->

<%@include file="../dynamic/footer.jspf"%>