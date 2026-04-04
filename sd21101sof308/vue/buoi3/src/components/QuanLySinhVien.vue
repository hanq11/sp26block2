<script setup>
import { ref } from 'vue';

const listSinhVien = ref([
    {
        id: "1",
        ten: "Nam",
        tuoi: 9,
        gioiTinh: true
    },
    {
        id: "2",
        ten: "Tram",
        tuoi: 19,
        gioiTinh: false
    },
    {
        id: "3",
        ten: "Tuan",
        tuoi: 29,
        gioiTinh: true
    }
])

const formSinhVien = ref({
    id: "",
    ten: "",
    tuoi: 0,
    gioiTinh: true
})

const themSinhVien = () => {
    listSinhVien.value.push({ ...formSinhVien.value })
}

const xoaSinhVien = (index) => {
    listSinhVien.value.splice(index, 1)
}

const detailSinhVien = (index) => {
    formSinhVien.value = { ...listSinhVien.value[index] }
}

const suaSinhVien = () => {
    let indexCanSua = listSinhVien.value.findIndex(sv => sv.id == formSinhVien.value.id)
    listSinhVien.value[indexCanSua] = formSinhVien.value
}
</script>

<template>
    <h2 class="text-center">Form sinh vien</h2>
    <div class="container">
        Id: <input type="text" v-model="formSinhVien.id"> <br>
        Ten: <input type="text" v-model="formSinhVien.ten"> <br>
        Tuoi: <input type="text" v-model="formSinhVien.tuoi"> <br>
        Gioi tinh: Nam <input type="radio" value="true" v-model="formSinhVien.gioiTinh">
        Nu <input type="radio" value="false" v-model="formSinhVien.gioiTinh"> <br>
        <button class="btn btn-primary" @click="themSinhVien()">Submit</button>
        <button class="btn btn-secondary" @click="suaSinhVien()">Sua</button>
    </div>
    <h2 class="text-center">Bang thong tin</h2>
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Ten</th>
                    <th scope="col">Tuoi</th>
                    <th scope="col">Gioi tinh</th>
                    <th scope="col">Hanh dong</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="(sv, index) in listSinhVien" :key="sv.id">
                    <td>{{ sv.id }}</td>
                    <td>{{ sv.ten }}</td>
                    <td>{{ sv.tuoi }}</td>
                    <td>{{ sv.gioiTinh == true ? "Nam" : "Nu" }}</td>
                    <td>
                        <button class="me-3 btn btn-secondary" @click="detailSinhVien(index)">Detail</button>
                        <button class="btn btn-warning" @click="xoaSinhVien(index)">Xoa</button>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</template>