"use strict";

$(function () {
  //重置模块
  $('.reset').on('click', function () {
    $('.reseter').modal('show');
  });
  $('.sure').on('click', function () {
    $('.username').val('');
    $('.password').val('');
    $('.user').html('');
    $('.pass').html('');
  }); //用户名验证

  var user_key = false;
  $('.username').on('blur', function () {
    $();

    if ($(this).val() == '') {
      $('.user').html('用户不能为空');
    } else {
      if ($(this).val() == user) {
        localStorage.setItem('username', $(this).val());
        user_key = true;
        $('.user').html('');
      } else {
        $('.user').html('用户不存在数据库中');
        user_key = false;
      }
    }
  });
  $.ajax({
    url: '/devUser/login'
  }); //密码验证

  var pas_key = false;
  var pass_rule = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[^]{8,16}$/;
  $('.password').on('blur', function () {
    if ($(this).val() == '') {
      $('.pass').html('密码不能为空');
    } else {
      if (pass_rule.test($(this).val())) {
        $('.pass').html('');

        if ($(this).val() == pass) {
          $('.pass').html('');
          pas_key = true;
        } else {
          $('.pass').html('密码不存在');
          pas_key = false;
        }
      } else {
        $('.pass').html('至少8-16位,至少1个大写字母1个小写字母和1个数字');
      }
    }
  }); //登录验证

  $('.login').on('click', function () {
    $('.username').trigger('blur');
    $('.password').trigger('blur');

    if (user_key == true && pas_key == true) {
      $('.username').val('');
      $('.password').val('');
      alert('验证成功,页面即将跳转');
    }
  });
});