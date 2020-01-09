<template>
    <div class="hello">
        <p>
            hello {{hello.name}}-san.
        </p>
    </div>


</template>

<script>

import axios from 'axios'

export default {
    name: "Hello",
    data() {
        return {
            hello: []
        }
    },
    created: function() {
        this.refresh()
    },
    methods: {
        refresh: function () {
            axios.get("/hello").then( res => {
                this.hello = res.data;
                console.log(res.data)
            })
        }
    }
}
</script>