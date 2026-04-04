<script setup>
import { ref } from 'vue';

const listSinhVien = ref([
    "ABC",
    "BDE",
    "AKD",
    "EID",
    "DID",
])
const items = ref([
    { id: 1, name: 'Táo', price: '$10' },
    { id: 2, name: 'Chuối', price: '$15' },
    { id: 3, name: 'Dưa hấu', price: '$18' },
]);
</script>

<template>
    <h2 style="color:red">V-For</h2>
    <ul>
        <li v-for="(sv, index) in listSinhVien">
            {{ sv }} co vi tri la {{ index }}
        </li>
    </ul>
    <h2>V-for with object</h2>
    <ul>
        <template v-for="item in items" :key="item.id">
            <li v-if="item.id > 1">
                Qua {{ item.name }} co id la {{ item.id }} co gia la {{ item.price }}
            </li>
        </template>
    </ul>

    <h2>V-For with table</h2>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Price</th>
            </tr>
        </thead>
        <tbody>
            <template v-for="item in items" :key="item.id">
                <tr>
                    <td>{{ item.id }}</td>
                    <td>{{ item.name }}</td>
                    <td>{{ item.price }}</td>
                </tr>
            </template>
        </tbody>
    </table>
</template>