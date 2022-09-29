package com.mumuniversity.daoimpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mumuniversity.config.Hibernateutil;
import com.mumuniversity.dao.UniversityDao;
import com.mumuniversity.entity.University;
import com.mumuniversity.entity.Student;


public class UniversitytDaoImpl implements UniversityDao {
	Session session=Hibernateutil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();

	
		@SuppressWarnings("deprecation")
		public void addUniversity() {
			University u=new University();
			u.setUid(4455);
			u.setUname("VashiBoard");
			u.setUlocation("Mumbai");
			u.setUemail("mumuniversity@org.com");
		
			Student s= new Student();
			s.setSid(101);
			s.setSname("Vishal");
			s.setSclass("FirstYear");
			s.setGender("Male");
			s.setSphone(983335981);
			s.setSstream("Bcom");
			s.setAddr("Chembur");
			
			Student s1=new Student();
			s1.setSid(102);
			s1.setSname("Ishita");
			s1.setSclass("SecondYear");
			s1.setGender("Female");
			s1.setSphone(65445678);
			s1.setSstream("BscCS");
			s1.setAddr("Govandi");
			
			Student s2=new Student();
			s2.setSid(103);
			s2.setSname("Aryan");
			s2.setSclass("ThirdYear");
			s2.setGender("Male");
			s2.setSphone(705123768);
			s2.setSstream("Arts");
			s2.setAddr("Mankhurd");
			
			ArrayList<Student> a1 = new ArrayList<Student>();
			a1.add(s);
			a1.add(s1);
			a1.add(s2);
			
			
			
			
			u.setStudent(a1);
			session.save(u);
			t.commit();
			System.out.println("Inserted Successfully");
		}
			
		
	


	public void fetchUniversity() {
		@SuppressWarnings({ "deprecation", "rawtypes" })
		Query q = (Query) session.createQuery("from University");
		
		//list with Citizen Entity
		@SuppressWarnings("unchecked")
		List<University> a11 = q.getResultList();
		
		//Traverse
		Iterator<University> itr = a11.iterator();
		while(itr.hasNext()) {
		University c1 = itr.next();
		@SuppressWarnings("unused")
		List<Student> a23 =  c1.getStudent();
System.out.println(c1.getUid() + " " +c1.getUname() +" "+c1.getUlocation() + " "+c1.getUemail() + " " + c1.getStudent() );

	
		
		
	}

	
	
	






		
	}
	

