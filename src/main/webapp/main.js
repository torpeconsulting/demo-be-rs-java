Vue.component('endpoint', {
    props: [ 'title', 'path' ],
    data() {
        return {
            isVisible: true
        }
    },
    template: `
        <article class="message" v-show="isVisible">
            <div class="message-header">
                <p>{{ title }}</p>
                <button class="delete" aria-label="delete" @click="isVisible = false"></button>
            </div>
            <div class="message-body">
                <a target="_blank" :href="href"><slot></slot></a>
            </div>
        </article>
    `,
    computed: {
        href() {
            return 'http://localhost:8080/demo/rest/v1' + this.path
        }
    }
});

new Vue({
    el: '#app'
});
  