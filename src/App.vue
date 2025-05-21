<script setup>
import HelloWorld from './components/HelloWorld.vue'
import TheWelcome from './components/TheWelcome.vue'
</script>




<style>
body {
  font-family: Arial, sans-serif;
}
</style>


<template>
  <div class="container">
    <h2>Текст отзыва:</h2>
    <textarea v-model="reviewText" placeholder="Введите текст..." rows="6" cols="60"/>
    <br />
    <button @click="submitReview">Отправить</button>

    <h3 v-if="sentiment">Эмоциональная характеристика</h3>
    <div v-if="sentiment">
      <p><strong>Настроение:</strong> {{ sentiment.Sentiment }}</p>
      <p><strong>Детали:</strong></p>
      <ul>
        
      </ul>
    </div>
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


