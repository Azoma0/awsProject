<script setup>
import HelloWorld from './components/HelloWorld.vue'
import TheWelcome from './components/TheWelcome.vue'
</script>

<template>
  

<template>
  <div class="p-4 max-w-2xl mx-auto">
    <h1 class="text-2xl font-bold mb-4">Отправить отзыв</h1>

    <label class="block font-semibold mb-1" for="review">Текст отзыва:</label>
    <textarea
      id="review"
      v-model="reviewText"
      placeholder="Введите текст..."
      class="w-full h-32 p-2 border rounded mb-3"
    ></textarea>

    <button
      @click="submitReview"
      class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600 mb-6"
    >
      Отправить
    </button>

    <div v-if="sentiment">
      <h2 class="font-bold text-lg mb-2">Эмоциональная характеристика</h2>
      <textarea
        class="w-full h-24 p-2 border rounded"
        :value="sentiment"
        readonly
      ></textarea>
    </div>
  </div>
</template>

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
        <li v-for="(value, key) in sentiment.SentimentScore" :key="key">
          {{ key }}: {{ (value * 100).toFixed(2) }}%
        </li>
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


</template>

<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
