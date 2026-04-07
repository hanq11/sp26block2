<template>
  <h2 class="text-center">Quan ly truyen tranh</h2>
  <div class="container">
    <div class="mb-3">
      <label for="id" class="form-label">Id</label>
      <input type="text" class="form-control" id="id" v-model="truyenTranhModel.id">
    </div>
    <div class="mb-3">
      <label for="tenTruyen" class="form-label">TenTruyen</label>
      <input type="text" class="form-control" id="tenTruyen" v-model="truyenTranhModel.tenTruyen">
    </div>
    <div class="mb-3">
      <label for="ngayPhatHanh" class="form-label">NgayPhatHanh</label>
      <input type="text" class="form-control" id="ngayPhatHanh" v-model="truyenTranhModel.ngayPhatHanh">
    </div>
    <div class="mb-3">
      <label for="gia" class="form-label">Gia</label>
      <input type="text" class="form-control" id="gia" v-model="truyenTranhModel.gia">
    </div>
    <div class="mb-3">
      <label for="conHang" class="form-label me-3">ConHang: </label>
      <input class="form-check-input" type="radio" name="conHang" id="conHang1">
      <label class="form-check-label" for="conHang1">
        Con
      </label>
      <input class="form-check-input" type="radio" name="conHang" id="conHang2">
      <label class="form-check-label" for="conHang2">
        Het
      </label>
    </div>
    <div class="mb-3">
      <label for="cuaHang" class="form-label">CuaHang</label>
      <select class="form-select" v-model="truyenTranhModel.cuaHang.id">
        <option v-for="cuaHang in listCuaHang" :value="cuaHang.id" :label="cuaHang.tenCuaHang"></option>
      </select>
    </div>
    <button class="btn btn-primary" @click="handleAddTruyenTranh()">Save</button>
  </div>
  <div class="container">
    <table class="table">
      <thead>
        <tr>
          <th scope="col">Id</th>
          <th scope="col">Ten Truyen</th>
          <th scope="col">Ngay Phat Hanh</th>
          <th scope="col">Gia</th>
          <th scope="col">Con Hang</th>
          <th scope="col">Ten Cua Hang</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="truyenTranh in listTruyenTranh" :key="truyenTranh.id">
          <td>{{ truyenTranh.id }}</td>
          <td>{{ truyenTranh.tenTruyen }}</td>
          <td>{{ truyenTranh.ngayPhatHanh }}</td>
          <td>{{ truyenTranh.gia }}</td>
          <td>{{ truyenTranh.conHang }}</td>
          <td>{{ truyenTranh.cuaHang.tenCuaHang }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue';
import { addTruyenTranh, fetchAllCuaHang, fetchAllTruyenTranh } from '@/service/TruyenTranhService';

const listTruyenTranh = ref([])
const listCuaHang = ref([])
const truyenTranhModel = ref({
  id: "",
  tenTruyen: "",
  ngayPhatHanh: "",
  gia: 0,
  conHang: false,
  cuaHang: {
    id: "",
    tenCuaHang: ""
  }
})

const handleFetchAllData = async () => {
  try {
    listTruyenTranh.value = await fetchAllTruyenTranh();
    listCuaHang.value = await fetchAllCuaHang();
  } catch (error) {
    console.log(error)
  }
}

onMounted(handleFetchAllData)

const handleAddTruyenTranh = async () => {
  try {
    await addTruyenTranh(truyenTranhModel.value)
    handleFetchAllData()
    clearForm()
  } catch (error) {
    console.log(error)
  }
}

const clearForm = () => {
  truyenTranhModel.value = {
    id: "",
    tenTruyen: "",
    ngayPhatHanh: "",
    gia: 0,
    conHang: false,
    cuaHang: {
      id: "",
      tenCuaHang: ""
    }
  }
}
</script>