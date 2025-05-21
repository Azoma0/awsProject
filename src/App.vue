


<style>
body {
  font-family: Arial, sans-serif;
}
</style>


<template>
  <div class="container">
    <h2>Текст отзыва:</h2>
    <textarea v-model="reviewText" placeholder="Введите текст..." rows="10" cols="100"/>
    <br />
    <button @click="submitReview">Отправить</button>

    
    
  </div>
  <div>
    <h2 >Эмоциональная характеристика</h2>
    <li class="status" style="height: 50px; width: 50px;">

    </li>
  </div>

<div>
  <area shape="0" coords="10" href="" alt="status">
</div>
  
</template>

<style>
.container {
  padding: 20px;
  font-family: sans-serif;
}
textarea {
  width: 100%;
  padding: 10px;
}
button {
  margin-top: 10px;
  padding: 10px 20px;
}
</style>


