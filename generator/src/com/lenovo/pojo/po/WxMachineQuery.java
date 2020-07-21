package com.lenovo.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxMachineQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public WxMachineQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMachineNoIsNull() {
            addCriterion("machine_no is null");
            return (Criteria) this;
        }

        public Criteria andMachineNoIsNotNull() {
            addCriterion("machine_no is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNoEqualTo(String value) {
            addCriterion("machine_no =", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotEqualTo(String value) {
            addCriterion("machine_no <>", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoGreaterThan(String value) {
            addCriterion("machine_no >", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoGreaterThanOrEqualTo(String value) {
            addCriterion("machine_no >=", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLessThan(String value) {
            addCriterion("machine_no <", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLessThanOrEqualTo(String value) {
            addCriterion("machine_no <=", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLike(String value) {
            addCriterion("machine_no like", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotLike(String value) {
            addCriterion("machine_no not like", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoIn(List<String> values) {
            addCriterion("machine_no in", values, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotIn(List<String> values) {
            addCriterion("machine_no not in", values, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoBetween(String value1, String value2) {
            addCriterion("machine_no between", value1, value2, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotBetween(String value1, String value2) {
            addCriterion("machine_no not between", value1, value2, "machineNo");
            return (Criteria) this;
        }

        public Criteria andProductlineIsNull() {
            addCriterion("productline is null");
            return (Criteria) this;
        }

        public Criteria andProductlineIsNotNull() {
            addCriterion("productline is not null");
            return (Criteria) this;
        }

        public Criteria andProductlineEqualTo(String value) {
            addCriterion("productline =", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotEqualTo(String value) {
            addCriterion("productline <>", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineGreaterThan(String value) {
            addCriterion("productline >", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineGreaterThanOrEqualTo(String value) {
            addCriterion("productline >=", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLessThan(String value) {
            addCriterion("productline <", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLessThanOrEqualTo(String value) {
            addCriterion("productline <=", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLike(String value) {
            addCriterion("productline like", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotLike(String value) {
            addCriterion("productline not like", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineIn(List<String> values) {
            addCriterion("productline in", values, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotIn(List<String> values) {
            addCriterion("productline not in", values, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineBetween(String value1, String value2) {
            addCriterion("productline between", value1, value2, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotBetween(String value1, String value2) {
            addCriterion("productline not between", value1, value2, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlinenameIsNull() {
            addCriterion("ProductLineName is null");
            return (Criteria) this;
        }

        public Criteria andProductlinenameIsNotNull() {
            addCriterion("ProductLineName is not null");
            return (Criteria) this;
        }

        public Criteria andProductlinenameEqualTo(String value) {
            addCriterion("ProductLineName =", value, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameNotEqualTo(String value) {
            addCriterion("ProductLineName <>", value, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameGreaterThan(String value) {
            addCriterion("ProductLineName >", value, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductLineName >=", value, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameLessThan(String value) {
            addCriterion("ProductLineName <", value, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameLessThanOrEqualTo(String value) {
            addCriterion("ProductLineName <=", value, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameLike(String value) {
            addCriterion("ProductLineName like", value, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameNotLike(String value) {
            addCriterion("ProductLineName not like", value, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameIn(List<String> values) {
            addCriterion("ProductLineName in", values, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameNotIn(List<String> values) {
            addCriterion("ProductLineName not in", values, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameBetween(String value1, String value2) {
            addCriterion("ProductLineName between", value1, value2, "productlinename");
            return (Criteria) this;
        }

        public Criteria andProductlinenameNotBetween(String value1, String value2) {
            addCriterion("ProductLineName not between", value1, value2, "productlinename");
            return (Criteria) this;
        }

        public Criteria andMachineclassidIsNull() {
            addCriterion("MachineClassId is null");
            return (Criteria) this;
        }

        public Criteria andMachineclassidIsNotNull() {
            addCriterion("MachineClassId is not null");
            return (Criteria) this;
        }

        public Criteria andMachineclassidEqualTo(String value) {
            addCriterion("MachineClassId =", value, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidNotEqualTo(String value) {
            addCriterion("MachineClassId <>", value, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidGreaterThan(String value) {
            addCriterion("MachineClassId >", value, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidGreaterThanOrEqualTo(String value) {
            addCriterion("MachineClassId >=", value, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidLessThan(String value) {
            addCriterion("MachineClassId <", value, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidLessThanOrEqualTo(String value) {
            addCriterion("MachineClassId <=", value, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidLike(String value) {
            addCriterion("MachineClassId like", value, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidNotLike(String value) {
            addCriterion("MachineClassId not like", value, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidIn(List<String> values) {
            addCriterion("MachineClassId in", values, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidNotIn(List<String> values) {
            addCriterion("MachineClassId not in", values, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidBetween(String value1, String value2) {
            addCriterion("MachineClassId between", value1, value2, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassidNotBetween(String value1, String value2) {
            addCriterion("MachineClassId not between", value1, value2, "machineclassid");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameIsNull() {
            addCriterion("MachineClassName is null");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameIsNotNull() {
            addCriterion("MachineClassName is not null");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameEqualTo(String value) {
            addCriterion("MachineClassName =", value, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameNotEqualTo(String value) {
            addCriterion("MachineClassName <>", value, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameGreaterThan(String value) {
            addCriterion("MachineClassName >", value, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("MachineClassName >=", value, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameLessThan(String value) {
            addCriterion("MachineClassName <", value, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameLessThanOrEqualTo(String value) {
            addCriterion("MachineClassName <=", value, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameLike(String value) {
            addCriterion("MachineClassName like", value, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameNotLike(String value) {
            addCriterion("MachineClassName not like", value, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameIn(List<String> values) {
            addCriterion("MachineClassName in", values, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameNotIn(List<String> values) {
            addCriterion("MachineClassName not in", values, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameBetween(String value1, String value2) {
            addCriterion("MachineClassName between", value1, value2, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andMachineclassnameNotBetween(String value1, String value2) {
            addCriterion("MachineClassName not between", value1, value2, "machineclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameIsNull() {
            addCriterion("SubClassName is null");
            return (Criteria) this;
        }

        public Criteria andSubclassnameIsNotNull() {
            addCriterion("SubClassName is not null");
            return (Criteria) this;
        }

        public Criteria andSubclassnameEqualTo(String value) {
            addCriterion("SubClassName =", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameNotEqualTo(String value) {
            addCriterion("SubClassName <>", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameGreaterThan(String value) {
            addCriterion("SubClassName >", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("SubClassName >=", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameLessThan(String value) {
            addCriterion("SubClassName <", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameLessThanOrEqualTo(String value) {
            addCriterion("SubClassName <=", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameLike(String value) {
            addCriterion("SubClassName like", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameNotLike(String value) {
            addCriterion("SubClassName not like", value, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameIn(List<String> values) {
            addCriterion("SubClassName in", values, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameNotIn(List<String> values) {
            addCriterion("SubClassName not in", values, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameBetween(String value1, String value2) {
            addCriterion("SubClassName between", value1, value2, "subclassname");
            return (Criteria) this;
        }

        public Criteria andSubclassnameNotBetween(String value1, String value2) {
            addCriterion("SubClassName not between", value1, value2, "subclassname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameIsNull() {
            addCriterion("MachineSerialName is null");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameIsNotNull() {
            addCriterion("MachineSerialName is not null");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameEqualTo(String value) {
            addCriterion("MachineSerialName =", value, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameNotEqualTo(String value) {
            addCriterion("MachineSerialName <>", value, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameGreaterThan(String value) {
            addCriterion("MachineSerialName >", value, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameGreaterThanOrEqualTo(String value) {
            addCriterion("MachineSerialName >=", value, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameLessThan(String value) {
            addCriterion("MachineSerialName <", value, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameLessThanOrEqualTo(String value) {
            addCriterion("MachineSerialName <=", value, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameLike(String value) {
            addCriterion("MachineSerialName like", value, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameNotLike(String value) {
            addCriterion("MachineSerialName not like", value, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameIn(List<String> values) {
            addCriterion("MachineSerialName in", values, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameNotIn(List<String> values) {
            addCriterion("MachineSerialName not in", values, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameBetween(String value1, String value2) {
            addCriterion("MachineSerialName between", value1, value2, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andMachineserialnameNotBetween(String value1, String value2) {
            addCriterion("MachineSerialName not between", value1, value2, "machineserialname");
            return (Criteria) this;
        }

        public Criteria andModeltypenameIsNull() {
            addCriterion("ModelTypeName is null");
            return (Criteria) this;
        }

        public Criteria andModeltypenameIsNotNull() {
            addCriterion("ModelTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andModeltypenameEqualTo(String value) {
            addCriterion("ModelTypeName =", value, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameNotEqualTo(String value) {
            addCriterion("ModelTypeName <>", value, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameGreaterThan(String value) {
            addCriterion("ModelTypeName >", value, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameGreaterThanOrEqualTo(String value) {
            addCriterion("ModelTypeName >=", value, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameLessThan(String value) {
            addCriterion("ModelTypeName <", value, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameLessThanOrEqualTo(String value) {
            addCriterion("ModelTypeName <=", value, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameLike(String value) {
            addCriterion("ModelTypeName like", value, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameNotLike(String value) {
            addCriterion("ModelTypeName not like", value, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameIn(List<String> values) {
            addCriterion("ModelTypeName in", values, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameNotIn(List<String> values) {
            addCriterion("ModelTypeName not in", values, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameBetween(String value1, String value2) {
            addCriterion("ModelTypeName between", value1, value2, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andModeltypenameNotBetween(String value1, String value2) {
            addCriterion("ModelTypeName not between", value1, value2, "modeltypename");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIsNull() {
            addCriterion("MaterialNo is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIsNotNull() {
            addCriterion("MaterialNo is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnoEqualTo(String value) {
            addCriterion("MaterialNo =", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotEqualTo(String value) {
            addCriterion("MaterialNo <>", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoGreaterThan(String value) {
            addCriterion("MaterialNo >", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoGreaterThanOrEqualTo(String value) {
            addCriterion("MaterialNo >=", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLessThan(String value) {
            addCriterion("MaterialNo <", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLessThanOrEqualTo(String value) {
            addCriterion("MaterialNo <=", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLike(String value) {
            addCriterion("MaterialNo like", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotLike(String value) {
            addCriterion("MaterialNo not like", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIn(List<String> values) {
            addCriterion("MaterialNo in", values, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotIn(List<String> values) {
            addCriterion("MaterialNo not in", values, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoBetween(String value1, String value2) {
            addCriterion("MaterialNo between", value1, value2, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotBetween(String value1, String value2) {
            addCriterion("MaterialNo not between", value1, value2, "materialno");
            return (Criteria) this;
        }

        public Criteria andMachineNameIsNull() {
            addCriterion("machine_name is null");
            return (Criteria) this;
        }

        public Criteria andMachineNameIsNotNull() {
            addCriterion("machine_name is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNameEqualTo(String value) {
            addCriterion("machine_name =", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotEqualTo(String value) {
            addCriterion("machine_name <>", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThan(String value) {
            addCriterion("machine_name >", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThanOrEqualTo(String value) {
            addCriterion("machine_name >=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThan(String value) {
            addCriterion("machine_name <", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThanOrEqualTo(String value) {
            addCriterion("machine_name <=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLike(String value) {
            addCriterion("machine_name like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotLike(String value) {
            addCriterion("machine_name not like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameIn(List<String> values) {
            addCriterion("machine_name in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotIn(List<String> values) {
            addCriterion("machine_name not in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameBetween(String value1, String value2) {
            addCriterion("machine_name between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotBetween(String value1, String value2) {
            addCriterion("machine_name not between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidIsNull() {
            addCriterion("BrandTypeId is null");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidIsNotNull() {
            addCriterion("BrandTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidEqualTo(String value) {
            addCriterion("BrandTypeId =", value, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidNotEqualTo(String value) {
            addCriterion("BrandTypeId <>", value, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidGreaterThan(String value) {
            addCriterion("BrandTypeId >", value, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("BrandTypeId >=", value, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidLessThan(String value) {
            addCriterion("BrandTypeId <", value, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidLessThanOrEqualTo(String value) {
            addCriterion("BrandTypeId <=", value, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidLike(String value) {
            addCriterion("BrandTypeId like", value, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidNotLike(String value) {
            addCriterion("BrandTypeId not like", value, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidIn(List<String> values) {
            addCriterion("BrandTypeId in", values, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidNotIn(List<String> values) {
            addCriterion("BrandTypeId not in", values, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidBetween(String value1, String value2) {
            addCriterion("BrandTypeId between", value1, value2, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andBrandtypeidNotBetween(String value1, String value2) {
            addCriterion("BrandTypeId not between", value1, value2, "brandtypeid");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNull() {
            addCriterion("MaterialName is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNotNull() {
            addCriterion("MaterialName is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameEqualTo(String value) {
            addCriterion("MaterialName =", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotEqualTo(String value) {
            addCriterion("MaterialName <>", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThan(String value) {
            addCriterion("MaterialName >", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThanOrEqualTo(String value) {
            addCriterion("MaterialName >=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThan(String value) {
            addCriterion("MaterialName <", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThanOrEqualTo(String value) {
            addCriterion("MaterialName <=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLike(String value) {
            addCriterion("MaterialName like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotLike(String value) {
            addCriterion("MaterialName not like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIn(List<String> values) {
            addCriterion("MaterialName in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotIn(List<String> values) {
            addCriterion("MaterialName not in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameBetween(String value1, String value2) {
            addCriterion("MaterialName between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotBetween(String value1, String value2) {
            addCriterion("MaterialName not between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andTreeidIsNull() {
            addCriterion("treeid is null");
            return (Criteria) this;
        }

        public Criteria andTreeidIsNotNull() {
            addCriterion("treeid is not null");
            return (Criteria) this;
        }

        public Criteria andTreeidEqualTo(String value) {
            addCriterion("treeid =", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidNotEqualTo(String value) {
            addCriterion("treeid <>", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidGreaterThan(String value) {
            addCriterion("treeid >", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidGreaterThanOrEqualTo(String value) {
            addCriterion("treeid >=", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidLessThan(String value) {
            addCriterion("treeid <", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidLessThanOrEqualTo(String value) {
            addCriterion("treeid <=", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidLike(String value) {
            addCriterion("treeid like", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidNotLike(String value) {
            addCriterion("treeid not like", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidIn(List<String> values) {
            addCriterion("treeid in", values, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidNotIn(List<String> values) {
            addCriterion("treeid not in", values, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidBetween(String value1, String value2) {
            addCriterion("treeid between", value1, value2, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidNotBetween(String value1, String value2) {
            addCriterion("treeid not between", value1, value2, "treeid");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateIsNull() {
            addCriterion("warranty_date is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateIsNotNull() {
            addCriterion("warranty_date is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateEqualTo(Date value) {
            addCriterion("warranty_date =", value, "warrantyDate");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateNotEqualTo(Date value) {
            addCriterion("warranty_date <>", value, "warrantyDate");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateGreaterThan(Date value) {
            addCriterion("warranty_date >", value, "warrantyDate");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("warranty_date >=", value, "warrantyDate");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateLessThan(Date value) {
            addCriterion("warranty_date <", value, "warrantyDate");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateLessThanOrEqualTo(Date value) {
            addCriterion("warranty_date <=", value, "warrantyDate");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateIn(List<Date> values) {
            addCriterion("warranty_date in", values, "warrantyDate");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateNotIn(List<Date> values) {
            addCriterion("warranty_date not in", values, "warrantyDate");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateBetween(Date value1, Date value2) {
            addCriterion("warranty_date between", value1, value2, "warrantyDate");
            return (Criteria) this;
        }

        public Criteria andWarrantyDateNotBetween(Date value1, Date value2) {
            addCriterion("warranty_date not between", value1, value2, "warrantyDate");
            return (Criteria) this;
        }

        public Criteria andTreepicIsNull() {
            addCriterion("treepic is null");
            return (Criteria) this;
        }

        public Criteria andTreepicIsNotNull() {
            addCriterion("treepic is not null");
            return (Criteria) this;
        }

        public Criteria andTreepicEqualTo(String value) {
            addCriterion("treepic =", value, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicNotEqualTo(String value) {
            addCriterion("treepic <>", value, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicGreaterThan(String value) {
            addCriterion("treepic >", value, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicGreaterThanOrEqualTo(String value) {
            addCriterion("treepic >=", value, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicLessThan(String value) {
            addCriterion("treepic <", value, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicLessThanOrEqualTo(String value) {
            addCriterion("treepic <=", value, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicLike(String value) {
            addCriterion("treepic like", value, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicNotLike(String value) {
            addCriterion("treepic not like", value, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicIn(List<String> values) {
            addCriterion("treepic in", values, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicNotIn(List<String> values) {
            addCriterion("treepic not in", values, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicBetween(String value1, String value2) {
            addCriterion("treepic between", value1, value2, "treepic");
            return (Criteria) this;
        }

        public Criteria andTreepicNotBetween(String value1, String value2) {
            addCriterion("treepic not between", value1, value2, "treepic");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateIsNull() {
            addCriterion("onSiteEndDate is null");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateIsNotNull() {
            addCriterion("onSiteEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateEqualTo(Date value) {
            addCriterion("onSiteEndDate =", value, "onsiteenddate");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateNotEqualTo(Date value) {
            addCriterion("onSiteEndDate <>", value, "onsiteenddate");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateGreaterThan(Date value) {
            addCriterion("onSiteEndDate >", value, "onsiteenddate");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("onSiteEndDate >=", value, "onsiteenddate");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateLessThan(Date value) {
            addCriterion("onSiteEndDate <", value, "onsiteenddate");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateLessThanOrEqualTo(Date value) {
            addCriterion("onSiteEndDate <=", value, "onsiteenddate");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateIn(List<Date> values) {
            addCriterion("onSiteEndDate in", values, "onsiteenddate");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateNotIn(List<Date> values) {
            addCriterion("onSiteEndDate not in", values, "onsiteenddate");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateBetween(Date value1, Date value2) {
            addCriterion("onSiteEndDate between", value1, value2, "onsiteenddate");
            return (Criteria) this;
        }

        public Criteria andOnsiteenddateNotBetween(Date value1, Date value2) {
            addCriterion("onSiteEndDate not between", value1, value2, "onsiteenddate");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andCatalognameIsNull() {
            addCriterion("CatalogName is null");
            return (Criteria) this;
        }

        public Criteria andCatalognameIsNotNull() {
            addCriterion("CatalogName is not null");
            return (Criteria) this;
        }

        public Criteria andCatalognameEqualTo(String value) {
            addCriterion("CatalogName =", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameNotEqualTo(String value) {
            addCriterion("CatalogName <>", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameGreaterThan(String value) {
            addCriterion("CatalogName >", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameGreaterThanOrEqualTo(String value) {
            addCriterion("CatalogName >=", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameLessThan(String value) {
            addCriterion("CatalogName <", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameLessThanOrEqualTo(String value) {
            addCriterion("CatalogName <=", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameLike(String value) {
            addCriterion("CatalogName like", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameNotLike(String value) {
            addCriterion("CatalogName not like", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameIn(List<String> values) {
            addCriterion("CatalogName in", values, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameNotIn(List<String> values) {
            addCriterion("CatalogName not in", values, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameBetween(String value1, String value2) {
            addCriterion("CatalogName between", value1, value2, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameNotBetween(String value1, String value2) {
            addCriterion("CatalogName not between", value1, value2, "catalogname");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceIsNull() {
            addCriterion("IsDisplayDevice is null");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceIsNotNull() {
            addCriterion("IsDisplayDevice is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceEqualTo(String value) {
            addCriterion("IsDisplayDevice =", value, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceNotEqualTo(String value) {
            addCriterion("IsDisplayDevice <>", value, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceGreaterThan(String value) {
            addCriterion("IsDisplayDevice >", value, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceGreaterThanOrEqualTo(String value) {
            addCriterion("IsDisplayDevice >=", value, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceLessThan(String value) {
            addCriterion("IsDisplayDevice <", value, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceLessThanOrEqualTo(String value) {
            addCriterion("IsDisplayDevice <=", value, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceLike(String value) {
            addCriterion("IsDisplayDevice like", value, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceNotLike(String value) {
            addCriterion("IsDisplayDevice not like", value, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceIn(List<String> values) {
            addCriterion("IsDisplayDevice in", values, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceNotIn(List<String> values) {
            addCriterion("IsDisplayDevice not in", values, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceBetween(String value1, String value2) {
            addCriterion("IsDisplayDevice between", value1, value2, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIsdisplaydeviceNotBetween(String value1, String value2) {
            addCriterion("IsDisplayDevice not between", value1, value2, "isdisplaydevice");
            return (Criteria) this;
        }

        public Criteria andIshostIsNull() {
            addCriterion("IsHost is null");
            return (Criteria) this;
        }

        public Criteria andIshostIsNotNull() {
            addCriterion("IsHost is not null");
            return (Criteria) this;
        }

        public Criteria andIshostEqualTo(String value) {
            addCriterion("IsHost =", value, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostNotEqualTo(String value) {
            addCriterion("IsHost <>", value, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostGreaterThan(String value) {
            addCriterion("IsHost >", value, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostGreaterThanOrEqualTo(String value) {
            addCriterion("IsHost >=", value, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostLessThan(String value) {
            addCriterion("IsHost <", value, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostLessThanOrEqualTo(String value) {
            addCriterion("IsHost <=", value, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostLike(String value) {
            addCriterion("IsHost like", value, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostNotLike(String value) {
            addCriterion("IsHost not like", value, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostIn(List<String> values) {
            addCriterion("IsHost in", values, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostNotIn(List<String> values) {
            addCriterion("IsHost not in", values, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostBetween(String value1, String value2) {
            addCriterion("IsHost between", value1, value2, "ishost");
            return (Criteria) this;
        }

        public Criteria andIshostNotBetween(String value1, String value2) {
            addCriterion("IsHost not between", value1, value2, "ishost");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNull() {
            addCriterion("ModelType is null");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNotNull() {
            addCriterion("ModelType is not null");
            return (Criteria) this;
        }

        public Criteria andModeltypeEqualTo(String value) {
            addCriterion("ModelType =", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotEqualTo(String value) {
            addCriterion("ModelType <>", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThan(String value) {
            addCriterion("ModelType >", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThanOrEqualTo(String value) {
            addCriterion("ModelType >=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThan(String value) {
            addCriterion("ModelType <", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThanOrEqualTo(String value) {
            addCriterion("ModelType <=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLike(String value) {
            addCriterion("ModelType like", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotLike(String value) {
            addCriterion("ModelType not like", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeIn(List<String> values) {
            addCriterion("ModelType in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotIn(List<String> values) {
            addCriterion("ModelType not in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeBetween(String value1, String value2) {
            addCriterion("ModelType between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotBetween(String value1, String value2) {
            addCriterion("ModelType not between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeidIsNull() {
            addCriterion("ModelTypeId is null");
            return (Criteria) this;
        }

        public Criteria andModeltypeidIsNotNull() {
            addCriterion("ModelTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andModeltypeidEqualTo(String value) {
            addCriterion("ModelTypeId =", value, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidNotEqualTo(String value) {
            addCriterion("ModelTypeId <>", value, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidGreaterThan(String value) {
            addCriterion("ModelTypeId >", value, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidGreaterThanOrEqualTo(String value) {
            addCriterion("ModelTypeId >=", value, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidLessThan(String value) {
            addCriterion("ModelTypeId <", value, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidLessThanOrEqualTo(String value) {
            addCriterion("ModelTypeId <=", value, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidLike(String value) {
            addCriterion("ModelTypeId like", value, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidNotLike(String value) {
            addCriterion("ModelTypeId not like", value, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidIn(List<String> values) {
            addCriterion("ModelTypeId in", values, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidNotIn(List<String> values) {
            addCriterion("ModelTypeId not in", values, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidBetween(String value1, String value2) {
            addCriterion("ModelTypeId between", value1, value2, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andModeltypeidNotBetween(String value1, String value2) {
            addCriterion("ModelTypeId not between", value1, value2, "modeltypeid");
            return (Criteria) this;
        }

        public Criteria andProductdateIsNull() {
            addCriterion("ProductDate is null");
            return (Criteria) this;
        }

        public Criteria andProductdateIsNotNull() {
            addCriterion("ProductDate is not null");
            return (Criteria) this;
        }

        public Criteria andProductdateEqualTo(Date value) {
            addCriterion("ProductDate =", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateNotEqualTo(Date value) {
            addCriterion("ProductDate <>", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateGreaterThan(Date value) {
            addCriterion("ProductDate >", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ProductDate >=", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateLessThan(Date value) {
            addCriterion("ProductDate <", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateLessThanOrEqualTo(Date value) {
            addCriterion("ProductDate <=", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateIn(List<Date> values) {
            addCriterion("ProductDate in", values, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateNotIn(List<Date> values) {
            addCriterion("ProductDate not in", values, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateBetween(Date value1, Date value2) {
            addCriterion("ProductDate between", value1, value2, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateNotBetween(Date value1, Date value2) {
            addCriterion("ProductDate not between", value1, value2, "productdate");
            return (Criteria) this;
        }

        public Criteria andScandateIsNull() {
            addCriterion("ScanDate is null");
            return (Criteria) this;
        }

        public Criteria andScandateIsNotNull() {
            addCriterion("ScanDate is not null");
            return (Criteria) this;
        }

        public Criteria andScandateEqualTo(Date value) {
            addCriterion("ScanDate =", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateNotEqualTo(Date value) {
            addCriterion("ScanDate <>", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateGreaterThan(Date value) {
            addCriterion("ScanDate >", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateGreaterThanOrEqualTo(Date value) {
            addCriterion("ScanDate >=", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateLessThan(Date value) {
            addCriterion("ScanDate <", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateLessThanOrEqualTo(Date value) {
            addCriterion("ScanDate <=", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateIn(List<Date> values) {
            addCriterion("ScanDate in", values, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateNotIn(List<Date> values) {
            addCriterion("ScanDate not in", values, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateBetween(Date value1, Date value2) {
            addCriterion("ScanDate between", value1, value2, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateNotBetween(Date value1, Date value2) {
            addCriterion("ScanDate not between", value1, value2, "scandate");
            return (Criteria) this;
        }

        public Criteria andWebtreenameIsNull() {
            addCriterion("WebTreeName is null");
            return (Criteria) this;
        }

        public Criteria andWebtreenameIsNotNull() {
            addCriterion("WebTreeName is not null");
            return (Criteria) this;
        }

        public Criteria andWebtreenameEqualTo(String value) {
            addCriterion("WebTreeName =", value, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameNotEqualTo(String value) {
            addCriterion("WebTreeName <>", value, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameGreaterThan(String value) {
            addCriterion("WebTreeName >", value, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameGreaterThanOrEqualTo(String value) {
            addCriterion("WebTreeName >=", value, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameLessThan(String value) {
            addCriterion("WebTreeName <", value, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameLessThanOrEqualTo(String value) {
            addCriterion("WebTreeName <=", value, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameLike(String value) {
            addCriterion("WebTreeName like", value, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameNotLike(String value) {
            addCriterion("WebTreeName not like", value, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameIn(List<String> values) {
            addCriterion("WebTreeName in", values, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameNotIn(List<String> values) {
            addCriterion("WebTreeName not in", values, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameBetween(String value1, String value2) {
            addCriterion("WebTreeName between", value1, value2, "webtreename");
            return (Criteria) this;
        }

        public Criteria andWebtreenameNotBetween(String value1, String value2) {
            addCriterion("WebTreeName not between", value1, value2, "webtreename");
            return (Criteria) this;
        }

        public Criteria andSaleareaIsNull() {
            addCriterion("SaleArea is null");
            return (Criteria) this;
        }

        public Criteria andSaleareaIsNotNull() {
            addCriterion("SaleArea is not null");
            return (Criteria) this;
        }

        public Criteria andSaleareaEqualTo(String value) {
            addCriterion("SaleArea =", value, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaNotEqualTo(String value) {
            addCriterion("SaleArea <>", value, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaGreaterThan(String value) {
            addCriterion("SaleArea >", value, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaGreaterThanOrEqualTo(String value) {
            addCriterion("SaleArea >=", value, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaLessThan(String value) {
            addCriterion("SaleArea <", value, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaLessThanOrEqualTo(String value) {
            addCriterion("SaleArea <=", value, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaLike(String value) {
            addCriterion("SaleArea like", value, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaNotLike(String value) {
            addCriterion("SaleArea not like", value, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaIn(List<String> values) {
            addCriterion("SaleArea in", values, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaNotIn(List<String> values) {
            addCriterion("SaleArea not in", values, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaBetween(String value1, String value2) {
            addCriterion("SaleArea between", value1, value2, "salearea");
            return (Criteria) this;
        }

        public Criteria andSaleareaNotBetween(String value1, String value2) {
            addCriterion("SaleArea not between", value1, value2, "salearea");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}