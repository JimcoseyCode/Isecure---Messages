.class Lt/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lt/f$a;


# static fields
.field static final a:Lt/f;

.field private static final b:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lt/f;

    .line 2
    .line 3
    new-instance v1, Lt/h;

    .line 4
    .line 5
    invoke-direct {v1}, Lt/h;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lt/f;-><init>(Lt/f$a;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lt/h;->a:Lt/f;

    .line 12
    .line 13
    sget-object v0, Ly/H;->d:Ly/H;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lt/h;->b:Ljava/util/Set;

    .line 20
    .line 21
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Landroid/hardware/camera2/params/DynamicRangeProfiles;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Lt/h;->b:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Ly/H;)Ljava/util/Set;
    .locals 3

    .line 1
    sget-object v0, Ly/H;->d:Ly/H;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ly/H;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "DynamicRange is not supported: "

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {v0, p1}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lt/h;->b:Ljava/util/Set;

    .line 28
    .line 29
    return-object p1
.end method
