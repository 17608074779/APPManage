"use strict";

$(function () {
  // 左侧功能栏展开
  var dropdown1_key = true;
  $('.dropdown1_open').on('click', function () {
    if (dropdown1_key) {
      $('.dropdown_1').stop().show(400);
      dropdown1_key = false;
      $(this).css({
        background: 'rgba(0,0,0,.3)'
      });
    } else {
      $('.dropdown_1').stop().hide(400);
      dropdown1_key = true;
      $(this).css({
        background: ''
      });
    }
  });
  var dropdown2_key = true;
  $('.dropdown2_open').on('click', function () {
    if (dropdown2_key) {
      $('.dropdown_2').stop().show(400);
      dropdown2_key = false;
      $(this).css({
        background: 'rgba(0,0,0,.3)'
      });
    } else {
      $('.dropdown_2').stop().hide(400);
      dropdown2_key = true;
      $(this).css({
        background: ''
      });
    }
  }); // 收缩左侧用户信息单

  $('.shrink').on('click', function () {
    $('.app-left').stop().animate({
      left: '-240px'
    }, 400);
    $('.app-right').stop().animate({
      paddingLeft: '0'
    }, 350);
    $('.user_banner').stop().animate({
      paddingLeft: '40px'
    }, 350);
    $('.open_appleft').stop().animate({
      left: 0
    }, 400);
  });
  $('.sw_appleft').on('click', function () {
    $('.app-left').stop().animate({
      left: '0'
    }, 400);
    $('.open_appleft').stop().animate({
      left: '-40px'
    }, 400);
    $('.app-right').stop().animate({
      paddingLeft: '240px'
    }, 400);
    $('.user_banner').stop().animate({
      paddingLeft: '240px'
    }, 350);
  }); //用户banner登录退出

  var user_bannerkeys = true;
  $('.login_out').on('click', function () {
    if (user_bannerkeys) {
      $('.login_out_extend').stop().show(400);
      user_bannerkeys = false;
    } else {
      $('.login_out_extend').stop().hide(400);
      user_bannerkeys = true;
    }
  }); //打开APP信息维护

  $('.open_appinfo').on('click', function () {
    $('.WelCome').hide();
    $('.App_info').show();
    $('.add_app').hide();
  }); //打开app新增

  $('.new_app').on('click', function () {
    $('.App_info').hide();
    $('.add_app').show();
  }); //返回APP信息维护

  $('.back').on('click', function () {
    $('.App_info').show();
    $('.add_app').hide();
  });
});