.class public interface abstract Ly/r0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/r0$c;,
        Ly/r0$b;,
        Ly/r0$a;
    }
.end annotation


# static fields
.field public static final a:Ly/r0;

.field public static final b:Ly/r0;

.field public static final c:Ly/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly/q0;

    .line 2
    .line 3
    invoke-direct {v0}, Ly/q0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly/r0;->a:Ly/r0;

    .line 7
    .line 8
    new-instance v0, LF/W$b;

    .line 9
    .line 10
    invoke-static {}, Ly/r0;->b()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-direct {v0, v1, v2}, LF/W$b;-><init>(J)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ly/r0;->b:Ly/r0;

    .line 18
    .line 19
    new-instance v0, LF/W;

    .line 20
    .line 21
    invoke-static {}, Ly/r0;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-direct {v0, v1, v2}, LF/W;-><init>(J)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Ly/r0;->c:Ly/r0;

    .line 29
    .line 30
    return-void
.end method

.method public static b()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x1770

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic e(Ly/r0$b;)Ly/r0$c;
    .locals 0

    .line 1
    sget-object p0, Ly/r0$c;->d:Ly/r0$c;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public abstract a(Ly/r0$b;)Ly/r0$c;
.end method

.method public c()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method
