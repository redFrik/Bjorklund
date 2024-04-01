TestBjorklund : UnitTest {

	test_Bjorklund {
		var f= {|k, n, a|
			this.assertEquals(a, Bjorklund(k, n), "k % n %".format(k, n));
		};

		f.(1, 2, #[1, 0]);
		f.(1, 3, #[1, 0, 0]);
		f.(1, 4, #[1, 0, 0, 0]);
		f.(4, 12, #[1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0]);
		f.(2, 5, #[1, 0, 1, 0, 0]);
		f.(3, 4, #[1, 1, 1, 0]);
		f.(3, 5, #[1, 0, 1, 0, 1]);
		f.(3, 7, #[1, 0, 1, 0, 1, 0, 0]);
		f.(3, 8, #[1, 0, 0, 1, 0, 0, 1, 0]);
		f.(4, 7, #[1, 0, 1, 0, 1, 0, 1]);
		f.(4, 9, #[1, 0, 1, 0, 1, 0, 1, 0, 0]);
		f.(4, 11, #[1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0]);
		f.(5, 6, #[1, 1, 1, 1, 1, 0]);
		f.(5, 7, #[1, 0, 1, 1, 0, 1, 1]);
		f.(5, 8, #[1, 0, 1, 1, 0, 1, 1, 0]);
		f.(5, 9, #[1, 0, 1, 0, 1, 0, 1, 0, 1]);
		f.(5, 11, #[1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0]);
		f.(5, 12, #[1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0]);
		f.(5, 16, #[1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0]);
		f.(7, 8, #[1, 1, 1, 1, 1, 1, 1, 0]);
		f.(7, 12, #[1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0]);
		f.(7, 16, #[1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0]);
		f.(9, 16, #[1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0]);
		f.(11, 24, #[1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0]);
		f.(13, 24, #[1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0]);
		f.(0, 8, #[0, 0, 0, 0, 0, 0, 0, 0]);
		f.(8, 8, #[1, 1, 1, 1, 1, 1, 1, 1]);
		f.(12, 17, #[1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1]);
		f.(12, 27, #[1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0]);
		f.(41, 50, #[1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1]);
	}
}

//TestBjorklund.run
