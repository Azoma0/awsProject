<script setup>
import HelloWorld from './components/HelloWorld.vue'
import TheWelcome from './components/TheWelcome.vue'
</script>



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

