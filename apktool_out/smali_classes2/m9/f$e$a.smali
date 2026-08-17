.class public final Lm9/f$e$a;
.super Li9/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/f$e;->t(ZLm9/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Lm9/f$e;

.field final synthetic h:Lkotlin/jvm/internal/C;

.field final synthetic i:Z

.field final synthetic j:Lm9/m;

.field final synthetic k:Lkotlin/jvm/internal/B;

.field final synthetic l:Lkotlin/jvm/internal/C;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f$e;Lkotlin/jvm/internal/C;ZLm9/m;Lkotlin/jvm/internal/B;Lkotlin/jvm/internal/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm9/f$e$a;->e:Ljava/lang/String;

    .line 2
    .line 3
    iput-boolean p2, p0, Lm9/f$e$a;->f:Z

    .line 4
    .line 5
    iput-object p5, p0, Lm9/f$e$a;->g:Lm9/f$e;

    .line 6
    .line 7
    iput-object p6, p0, Lm9/f$e$a;->h:Lkotlin/jvm/internal/C;

    .line 8
    .line 9
    iput-boolean p7, p0, Lm9/f$e$a;->i:Z

    .line 10
    .line 11
    iput-object p8, p0, Lm9/f$e$a;->j:Lm9/m;

    .line 12
    .line 13
    iput-object p9, p0, Lm9/f$e$a;->k:Lkotlin/jvm/internal/B;

    .line 14
    .line 15
    iput-object p10, p0, Lm9/f$e$a;->l:Lkotlin/jvm/internal/C;

    .line 16
    .line 17
    invoke-direct {p0, p3, p4}, Li9/a;-><init>(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    .line 1
    iget-object v0, p0, Lm9/f$e$a;->g:Lm9/f$e;

    .line 2
    .line 3
    iget-object v0, v0, Lm9/f$e;->h:Lm9/f;

    .line 4
    .line 5
    invoke-virtual {v0}, Lm9/f;->D0()Lm9/f$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lm9/f$e$a;->g:Lm9/f$e;

    .line 10
    .line 11
    iget-object v1, v1, Lm9/f$e;->h:Lm9/f;

    .line 12
    .line 13
    iget-object v2, p0, Lm9/f$e$a;->h:Lkotlin/jvm/internal/C;

    .line 14
    .line 15
    iget-object v2, v2, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lm9/m;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lm9/f$d;->a(Lm9/f;Lm9/m;)V

    .line 20
    .line 21
    .line 22
    const-wide/16 v0, -0x1

    .line 23
    .line 24
    return-wide v0
.end method
