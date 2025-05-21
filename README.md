# vue-project

This template should help get you started developing with Vue 3 in Vite.

## Recommended IDE Setup

[VSCode](https://code.visualstudio.com/) + [Volar](https://marketplace.visualstudio.com/items?itemName=Vue.volar) (and disable Vetur).

## Customize configuration

See [Vite Configuration Reference](https://vite.dev/config/).

## Project Setup

```sh
npm install
```

### Compile and Hot-Reload for Development

```sh
npm run dev
```

### Compile and Minify for Production

```sh
npm run build
```
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

<script>
export default {
  data() {
    return {
      reviewText: '',
      sentiment: ''
    };
  },
  methods: {
    async submitReview() {
      // Отправка отзыва на backend (замени URL своим)
      const response = await fetch('https://your-backend-endpoint.com/review', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ text: this.reviewText })
      });

      const data = await response.json();
      this.sentiment = data.sentiment || 'Нет результата';
    }
  }
};
</script>

<style>
body {
  font-family: Arial, sans-serif;
}
</style>


<template>
  <div class="container">
    <h2>Текст отзыва:</h2>
    <textarea v-model="reviewText" placeholder="Введите текст..." rows="6" cols="60" />
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

<script>
export default {
  data() {
    return {
      reviewText: '',
      sentiment: null
    }
  },
  methods: {
    async submitReview() {
      try {
        const response = await fetch('https://your-backend-url/submit-review', {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({ text: this.reviewText })
        });

        const data = await response.json();
        this.sentiment = data.sentiment; // пример: { Sentiment: "POSITIVE", SentimentScore: { Positive: 0.98, ... } }
      } catch (error) {
        console.error('Ошибка при отправке:', error);
      }
    }
  }
}
</script>

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

