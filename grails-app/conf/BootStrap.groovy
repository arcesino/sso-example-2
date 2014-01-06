import codeisdesign.example.sso.security.User

class BootStrap {

	def init = { servletContext ->
		new User(
				username:"cas@winbits.com",
				password:"s3cr3t0",
				enabled:true,
				accountExpired:false,
				accountLocked:false,
				passwordExpired:false
				).save(flush:true)
	}
	def destroy = {
	}
}
