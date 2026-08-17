.class public final Lm9/f$i;
.super Li9/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/f;->W0(ILm9/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Lm9/f;

.field final synthetic h:I

.field final synthetic i:Lm9/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f;ILm9/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm9/f$i;->e:Ljava/lang/String;

    .line 2
    .line 3
    iput-boolean p2, p0, Lm9/f$i;->f:Z

    .line 4
    .line 5
    iput-object p5, p0, Lm9/f$i;->g:Lm9/f;

    .line 6
    .line 7
    iput p6, p0, Lm9/f$i;->h:I

    .line 8
    .line 9
    iput-object p7, p0, Lm9/f$i;->i:Lm9/b;

    .line 10
    .line 11
    invoke-direct {p0, p3, p4}, Li9/a;-><init>(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    .line 1
    iget-object v0, p0, Lm9/f$i;->g:Lm9/f;

    .line 2
    .line 3
    invoke-static {v0}, Lm9/f;->B(Lm9/f;)Lm9/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lm9/f$i;->h:I

    .line 8
    .line 9
    iget-object v2, p0, Lm9/f$i;->i:Lm9/b;

    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Lm9/l;->b(ILm9/b;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lm9/f$i;->g:Lm9/f;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    iget-object v1, p0, Lm9/f$i;->g:Lm9/f;

    .line 18
    .line 19
    invoke-static {v1}, Lm9/f;->k(Lm9/f;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget v2, p0, Lm9/f$i;->h:I

    .line 24
    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    const-wide/16 v0, -0x1

    .line 36
    .line 37
    return-wide v0

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    monitor-exit v0

    .line 40
    throw v1
.end method
