<template>
  <div class="main-container">
    <div class="main-content">
      <div class="row">
        <div class="col-sm-10 col-sm-offset-1">
          <div class="login-container">
            <div class="center">
              <h1>
                <i class="ace-icon fa fa-leaf green"></i>
                <span class="red">Angelo@</span>
                <span class="white" id="id-text2"><a>www.angelo.show</a></span>
              </h1>
              <h4 class="blue" id="id-company-text">&copy; NJ.SUNYUE</h4>
            </div>

            <div class="space-6"></div>

            <div class="position-relative">
              <div id="login-box" class="login-box visible widget-box no-border">
                <div class="widget-body">
                  <div class="widget-main">
                    <h4 class="header blue lighter bigger">
                      <i class="ace-icon fa fa-coffee green"></i>
                      登录
                    </h4>

                    <div class="space-6"></div>

                    <form>
                      <fieldset>
                        <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" placeholder="Username" />
															<i class="ace-icon fa fa-user"></i>
														</span>
                        </label>

                        <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="Password" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
                        </label>

                        <div class="space"></div>

                        <div class="clearfix">
                          <label class="inline">
                            <input type="checkbox" class="ace" />
                            <span class="lbl"> Remember Me</span>
                          </label>

                          <button type="button" class="width-35 pull-right btn btn-sm btn-primary" v-on:click="login">
                            <i class="ace-icon fa fa-key"></i>
                            <span class="bigger-110">Login</span>
                          </button>
                        </div>

                        <div class="space-4"></div>
                      </fieldset>
                    </form>

                    <div class="social-or-login center">
                      <span class="bigger-110">Or Login Using</span>
                    </div>

                    <div class="space-6"></div>

                    <div class="social-login center">
                      <a class="btn btn-primary">
                        <i class="ace-icon fa fa-facebook"></i>
                      </a>

                      <a class="btn btn-info">
                        <i class="ace-icon fa fa-twitter"></i>
                      </a>

                      <a class="btn btn-danger">
                        <i class="ace-icon fa fa-google-plus"></i>
                      </a>
                    </div>
                  </div><!-- /.widget-main -->

                  <div class="toolbar clearfix">
                    <div>
                      <a href="#" data-target="#forgot-box" class="forgot-password-link">
                        <i class="ace-icon fa fa-arrow-left"></i>
                        I forgot my password
                      </a>
                    </div>

                    <div>
                      <a href="#" data-target="#signup-box" class="user-signup-link">
                        I want to register
                        <i class="ace-icon fa fa-arrow-right"></i>
                      </a>
                    </div>
                  </div>
                </div><!-- /.widget-body -->
              </div><!-- /.login-box -->
            </div><!-- /.position-relative -->

            <div class="navbar-fixed-top align-right">
              <br />
              &nbsp;
              <a id="btn-login-dark" href="#">Dark</a>
              &nbsp;
              <span class="blue">/</span>
              &nbsp;
              <a id="btn-login-blur" href="#">Blur</a>
              &nbsp;
              <span class="blue">/</span>
              &nbsp;
              <a id="btn-login-light" href="#">Light</a>
              &nbsp; &nbsp; &nbsp;
            </div>
          </div>
        </div><!-- /.col -->
      </div><!-- /.row -->
    </div><!-- /.main-content -->
  </div><!-- /.main-container -->
</template>

<script>

export default {
  name: 'login',
  mounted:function () {
    // $('body').removeClass()
    $('body').attr('class', 'login-layout blur-login');
  },
  components: {
  },
  methods:{
    login(){
      this.$router.push("/admin")
    }
  }
}
</script>

