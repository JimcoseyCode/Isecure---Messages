.class public final Lh1/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh1/h$a;
    }
.end annotation


# static fields
.field public static final c:Lh1/h$a;


# instance fields
.field private final a:Li1/b;

.field private final b:Lh1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh1/h$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lh1/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lh1/h;->c:Lh1/h$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Li1/b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lh1/h;->a:Li1/b;

    .line 4
    new-instance v0, Lh1/f;

    invoke-direct {v0, p1}, Lh1/f;-><init>(Li1/b;)V

    iput-object v0, p0, Lh1/h;->b:Lh1/f;

    return-void
.end method

.method public synthetic constructor <init>(Li1/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh1/h;-><init>(Li1/b;)V

    return-void
.end method

.method public static final a(Lh1/i;)Lh1/h;
    .locals 1

    .line 1
    sget-object v0, Lh1/h;->c:Lh1/h$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lh1/h$a;->b(Lh1/i;)Lh1/h;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final b()Lh1/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lh1/h;->b:Lh1/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh1/h;->a:Li1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Li1/b;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh1/h;->a:Li1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li1/b;->h(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "outBundle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh1/h;->a:Li1/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Li1/b;->i(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
