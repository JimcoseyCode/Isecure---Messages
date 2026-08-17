.class public interface abstract LF/E;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/h1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/E$a;
    }
.end annotation


# static fields
.field public static final a:LF/j0$a;

.field public static final b:LF/j0$a;

.field public static final c:LF/j0$a;

.field public static final d:LF/j0$a;

.field public static final e:LF/j0$a;

.field public static final f:LF/j0$a;

.field public static final g:LF/j0$a;

.field public static final h:LF/j0$a;

.field public static final i:LF/E$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "camerax.core.camera.useCaseConfigFactory"

    .line 2
    .line 3
    const-class v1, LF/E1;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LF/E;->a:LF/j0$a;

    .line 10
    .line 11
    const-string v0, "camerax.core.camera.compatibilityId"

    .line 12
    .line 13
    const-class v1, LF/A0;

    .line 14
    .line 15
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, LF/E;->b:LF/j0$a;

    .line 20
    .line 21
    const-string v0, "camerax.core.camera.useCaseCombinationRequiredRule"

    .line 22
    .line 23
    const-class v1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, LF/E;->c:LF/j0$a;

    .line 30
    .line 31
    const-string v0, "camerax.core.camera.SessionProcessor"

    .line 32
    .line 33
    const-class v1, LF/m1;

    .line 34
    .line 35
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, LF/E;->d:LF/j0$a;

    .line 40
    .line 41
    const-string v0, "camerax.core.camera.isZslDisabled"

    .line 42
    .line 43
    const-class v1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, LF/E;->e:LF/j0$a;

    .line 50
    .line 51
    const-string v0, "camerax.core.camera.isPostviewSupported"

    .line 52
    .line 53
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, LF/E;->f:LF/j0$a;

    .line 58
    .line 59
    const-string v0, "camerax.core.camera.PostviewFormatSelector"

    .line 60
    .line 61
    const-class v2, LF/E$a;

    .line 62
    .line 63
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, LF/E;->g:LF/j0$a;

    .line 68
    .line 69
    const-string v0, "camerax.core.camera.isCaptureProcessProgressSupported"

    .line 70
    .line 71
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LF/E;->h:LF/j0$a;

    .line 76
    .line 77
    new-instance v0, LF/D;

    .line 78
    .line 79
    invoke-direct {v0}, LF/D;-><init>()V

    .line 80
    .line 81
    .line 82
    sput-object v0, LF/E;->i:LF/E$a;

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public D()I
    .locals 2

    .line 1
    sget-object v0, LF/E;->c:LF/j0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {p0, v0, v1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public R(LF/m1;)LF/m1;
    .locals 1

    .line 1
    sget-object v0, LF/E;->d:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return-object p1
.end method

.method public abstract T()LF/A0;
.end method

.method public U()Z
    .locals 2

    .line 1
    sget-object v0, LF/E;->h:LF/j0$a;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public j()LF/E1;
    .locals 2

    .line 1
    sget-object v0, LF/E;->a:LF/j0$a;

    .line 2
    .line 3
    sget-object v1, LF/E1;->a:LF/E1;

    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LF/E1;

    .line 10
    .line 11
    return-object v0
.end method

.method public z()Z
    .locals 2

    .line 1
    sget-object v0, LF/E;->f:LF/j0$a;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method
