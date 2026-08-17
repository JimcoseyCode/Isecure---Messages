.class public interface abstract LF/E0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/h1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/E0$a;
    }
.end annotation


# static fields
.field public static final m:LF/j0$a;

.field public static final n:LF/j0$a;

.field public static final o:LF/j0$a;

.field public static final p:LF/j0$a;

.field public static final q:LF/j0$a;

.field public static final r:LF/j0$a;

.field public static final s:LF/j0$a;

.field public static final t:LF/j0$a;

.field public static final u:LF/j0$a;

.field public static final v:LF/j0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "camerax.core.imageOutput.targetAspectRatio"

    .line 2
    .line 3
    const-class v1, Ly/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LF/E0;->m:LF/j0$a;

    .line 10
    .line 11
    const-string v0, "camerax.core.imageOutput.targetRotation"

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, LF/E0;->n:LF/j0$a;

    .line 20
    .line 21
    const-string v0, "camerax.core.imageOutput.appTargetRotation"

    .line 22
    .line 23
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, LF/E0;->o:LF/j0$a;

    .line 28
    .line 29
    const-string v0, "camerax.core.imageOutput.mirrorMode"

    .line 30
    .line 31
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LF/E0;->p:LF/j0$a;

    .line 36
    .line 37
    const-string v0, "camerax.core.imageOutput.targetResolution"

    .line 38
    .line 39
    const-class v1, Landroid/util/Size;

    .line 40
    .line 41
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, LF/E0;->q:LF/j0$a;

    .line 46
    .line 47
    const-string v0, "camerax.core.imageOutput.defaultResolution"

    .line 48
    .line 49
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, LF/E0;->r:LF/j0$a;

    .line 54
    .line 55
    const-string v0, "camerax.core.imageOutput.maxResolution"

    .line 56
    .line 57
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, LF/E0;->s:LF/j0$a;

    .line 62
    .line 63
    const-string v0, "camerax.core.imageOutput.supportedResolutions"

    .line 64
    .line 65
    const-class v1, Ljava/util/List;

    .line 66
    .line 67
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, LF/E0;->t:LF/j0$a;

    .line 72
    .line 73
    const-string v0, "camerax.core.imageOutput.resolutionSelector"

    .line 74
    .line 75
    const-class v2, LS/c;

    .line 76
    .line 77
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, LF/E0;->u:LF/j0$a;

    .line 82
    .line 83
    const-string v0, "camerax.core.imageOutput.customOrderedResolutions"

    .line 84
    .line 85
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, LF/E0;->v:LF/j0$a;

    .line 90
    .line 91
    return-void
.end method

.method public static P(LF/E0;)V
    .locals 3

    .line 1
    invoke-interface {p0}, LF/E0;->M()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {p0, v1}, LF/E0;->A(Landroid/util/Size;)Landroid/util/Size;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v0, "Cannot use both setTargetResolution and setTargetAspectRatio on the same config."

    .line 23
    .line 24
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0

    .line 28
    :cond_2
    :goto_1
    invoke-interface {p0, v1}, LF/E0;->V(LS/c;)LS/c;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_4

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    if-nez v2, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string v0, "Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config."

    .line 42
    .line 43
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public A(Landroid/util/Size;)Landroid/util/Size;
    .locals 1

    .line 1
    sget-object v0, LF/E0;->q:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/util/Size;

    .line 8
    .line 9
    return-object p1
.end method

.method public B(I)I
    .locals 1

    .line 1
    sget-object v0, LF/E0;->o:LF/j0$a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public M()Z
    .locals 1

    .line 1
    sget-object v0, LF/E0;->m:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LF/h1;->b(LF/j0$a;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public O()I
    .locals 1

    .line 1
    sget-object v0, LF/E0;->m:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LF/h1;->d(LF/j0$a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public V(LS/c;)LS/c;
    .locals 1

    .line 1
    sget-object v0, LF/E0;->u:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LS/c;

    .line 8
    .line 9
    return-object p1
.end method

.method public c0(I)I
    .locals 1

    .line 1
    sget-object v0, LF/E0;->n:LF/j0$a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public d0(I)I
    .locals 1

    .line 1
    sget-object v0, LF/E0;->p:LF/j0$a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public i(Landroid/util/Size;)Landroid/util/Size;
    .locals 1

    .line 1
    sget-object v0, LF/E0;->s:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/util/Size;

    .line 8
    .line 9
    return-object p1
.end method

.method public m(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, LF/E0;->t:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    return-object p1
.end method

.method public n()LS/c;
    .locals 1

    .line 1
    sget-object v0, LF/E0;->u:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LF/h1;->d(LF/j0$a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LS/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public p(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, LF/E0;->v:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method

.method public v(Landroid/util/Size;)Landroid/util/Size;
    .locals 1

    .line 1
    sget-object v0, LF/E0;->r:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/util/Size;

    .line 8
    .line 9
    return-object p1
.end method
