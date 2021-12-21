<template>
  <div class="d2-page-cover">
    
  </div>
</template>
<script>
import helper from './helper'

export default {
  data () {
    return {
      helper: helper
    }
  }
}
</script>
<style lang="scss" scoped>
.d2-page-cover {
  .logo {
    width: 40px;
    height: 40px;
  }
  display: flex;
  flex-flow: column nowrap;
  justify-content: center;
  align-items: center;
  .d2-page-cover__logo {
    img {
      width: 200px;
    }
  }
  .d2-page-cover__title {
    margin: 0px;
    margin-bottom: 10px;
    font-weight: bold;
    color: $color-text-main;
    display: -webkit-flex; /* Safari */
    display: flex;
    align-items:center;
    flex-direction: row;
    justify-content: center;
    cursor: pointer;
  }
  .d2-page-cover__sub-title {
    margin: 0px;
    margin-bottom: 10px;
    color: $color-text-normal;
  }
  .d2-page-cover__build-time {
    margin: 0px;
    margin-bottom: 0px;
    margin-top: 10px;
    font-size: 12px;
    color: $color-text-placehoder;
  }

  .exampleBox{
    display: flex;
    align-items:center;
    height:420px;
    width:90%;
    padding:5px;
    margin:auto;
    justify-content: center;
    .left{
      height:100%;
      overflow-y: hidden;
      border: 1px solid #aaa;
    }
    .icon{font-size: 50px;}
    .right{
      height:100%;
      img{
        height:100%;
      }
    }
    .d2-highlight{
      font-size: 8px;
    }
  }

  .toStar{
    position: absolute; top: 20px; right: 150px; border: 0;
    color:#4cc134;
    margin: 10px;
    animation: changeshadow 1s  ease-in  infinite ;
    /* 其它浏览器兼容性前缀 */
    -webkit-animation: changeshadow 1s linear infinite;
    -moz-animation: changeshadow 1s linear infinite;
    -ms-animation: changeshadow 1s linear infinite;
    -o-animation: changeshadow 1s linear infinite;
  }
  @keyframes changeshadow {
    0%{ text-shadow: 0 0 4px #4cc134}
    50%{ text-shadow: 0 0 40px #4cc134}
    100%{ text-shadow: 0 0 4px #4cc134}
  }
  @-webkit-keyframes changeshadow {
    0%{ text-shadow: 0 0 4px #4cc134}
    50%{ text-shadow: 0 0 40px #4cc134}
    100%{ text-shadow: 0 0 4px #4cc134}
  }
  @-moz-keyframes changeshadow {
    0%{ text-shadow: 0 0 4px #4cc134}
    50%{ text-shadow: 0 0 40px #4cc134}
    100%{ text-shadow: 0 0 4px #4cc134}
  }
  @-ms-keyframes changeshadow {
    0%{ text-shadow: 0 0 4px #4cc134}
    50%{ text-shadow: 0 0 40px #4cc134}
    100%{ text-shadow: 0 0 4px #4cc134}
  }
  @-o-keyframes changeshadow {
    0%{ text-shadow: 0 0 4px #4cc134}
    50%{ text-shadow: 0 0 40px #4cc134}
    100%{ text-shadow: 0 0 4px #4cc134}
  }
}
</style>
