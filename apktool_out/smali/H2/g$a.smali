.class final LH2/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lg2/a;

.field private b:Z


# direct methods
.method public constructor <init>(Lg2/a;)V
    .locals 1

    .line 1
    const-string v0, "bitmapRef"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LH2/g$a;->a:Lg2/a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Lg2/a;
    .locals 1

    .line 1
    iget-object v0, p0, LH2/g$a;->a:Lg2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LH2/g$a;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LH2/g$a;->a:Lg2/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lg2/a;->W()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, LH2/g$a;->a:Lg2/a;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/a;->B(Lg2/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LH2/g$a;->b:Z

    .line 2
    .line 3
    return-void
.end method
