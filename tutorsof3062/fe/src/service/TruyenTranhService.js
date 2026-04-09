const baseUrl = "http://localhost:8080/truyen-tranh";

export const fetchAllTruyenTranh = async () => {
  const response = await fetch(`${baseUrl}/hien-thi`);
  if (!response.ok) {
    throw new Error(response.status + ": " + (await response.text()));
  }
  return await response.json();
};

export const fetchAllCuaHang = async () => {
  const response = await fetch(`${baseUrl}/hien-thi-cua-hang`);
  if (!response.ok) {
    throw new Error(response.status + ": " + (await response.text()));
  }
  return await response.json();
};

export const addTruyenTranh = async (truyenTranh) => {
  const response = await fetch(`${baseUrl}/them`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(truyenTranh),
  });
  if (!response.ok) {
    throw new Error(response.status + ": " + (await response.text()));
  }
};

export const suaTruyenTranh = async (truyenTranh) => {
  const response = await fetch(`${baseUrl}/sua`, {
    method: "PUT",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(truyenTranh),
  });
  if (!response.ok) {
    throw new Error(response.status + ": " + (await response.text()));
  }
};

export const fetchTruyenTranhById = async (id) => {
  const response = await fetch(`${baseUrl}/${id}`);
  if (!response.ok) {
    throw new Error(response.status + ": " + (await response.text()));
  }
  return await response.json();
};
export const xoaTruyenTranh = async (id) => {
  const response = await fetch(`${baseUrl}/xoa/${id}`, {
    method: "DELETE",
  });
  if (!response.ok) {
    throw new Error(response.status + ": " + (await response.text()));
  }
};
