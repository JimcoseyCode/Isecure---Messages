.class public final LY2/u$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY2/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private A:Z

.field private B:LX1/d;

.field private C:LY2/q;

.field private D:Lc2/n;

.field private E:I

.field private final F:LY2/x$a;

.field private G:Z

.field private H:La3/a;

.field private I:LW2/x;

.field private J:LW2/x;

.field private K:La2/g;

.field private L:LW2/a;

.field private M:Ljava/util/Map;

.field private a:Landroid/graphics/Bitmap$Config;

.field private b:Lc2/n;

.field private c:LW2/n$b;

.field private d:LW2/x$a;

.field private e:LW2/x$a;

.field private f:LW2/k;

.field private final g:Landroid/content/Context;

.field private h:LY2/n;

.field private i:Lc2/n;

.field private j:LY2/p;

.field private k:LW2/t;

.field private l:Lb3/c;

.field private m:Lc2/n;

.field private n:Lk3/d;

.field private o:Ljava/lang/Integer;

.field private p:Lc2/n;

.field private q:LX1/d;

.field private r:Lf2/d;

.field private s:Ljava/lang/Integer;

.field private t:Lcom/facebook/imagepipeline/producers/X;

.field private u:LV2/d;

.field private v:Lg3/D;

.field private w:Lb3/e;

.field private x:Ljava/util/Set;

.field private y:Ljava/util/Set;

.field private z:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

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
    sget-object v0, LY2/n;->h:LY2/n;

    .line 10
    .line 11
    iput-object v0, p0, LY2/u$a;->h:LY2/n;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, LY2/u$a;->A:Z

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    iput v1, p0, LY2/u$a;->E:I

    .line 18
    .line 19
    new-instance v1, LY2/x$a;

    .line 20
    .line 21
    invoke-direct {v1, p0}, LY2/x$a;-><init>(LY2/u$a;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, LY2/u$a;->F:LY2/x$a;

    .line 25
    .line 26
    iput-boolean v0, p0, LY2/u$a;->G:Z

    .line 27
    .line 28
    new-instance v0, La3/b;

    .line 29
    .line 30
    invoke-direct {v0}, La3/b;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LY2/u$a;->H:La3/a;

    .line 34
    .line 35
    iput-object p1, p0, LY2/u$a;->g:Landroid/content/Context;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final A()Lb3/c;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->l:Lb3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Lb3/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final C()Lk3/d;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->n:Lk3/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->o:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()LX1/d;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->q:LX1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->s:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Lf2/d;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->r:Lf2/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()Lcom/facebook/imagepipeline/producers/X;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->t:Lcom/facebook/imagepipeline/producers/X;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()LV2/d;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->u:LV2/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Lg3/D;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->v:Lg3/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()Lb3/e;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->w:Lb3/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->y:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->x:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/u$a;->A:Z

    .line 2
    .line 3
    return v0
.end method

.method public final O()La2/g;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->K:La2/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()LX1/d;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->B:LX1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q()Lc2/n;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->p:Lc2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final R(LY2/n;)LY2/u$a;
    .locals 1

    .line 1
    const-string v0, "downsampleMode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LY2/u$a;->h:LY2/n;

    .line 7
    .line 8
    return-object p0
.end method

.method public final S(Lcom/facebook/imagepipeline/producers/X;)LY2/u$a;
    .locals 0

    .line 1
    iput-object p1, p0, LY2/u$a;->t:Lcom/facebook/imagepipeline/producers/X;

    .line 2
    .line 3
    return-object p0
.end method

.method public final T(Ljava/util/Set;)LY2/u$a;
    .locals 0

    .line 1
    iput-object p1, p0, LY2/u$a;->x:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public final a()LY2/u;
    .locals 2

    .line 1
    new-instance v0, LY2/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LY2/u;-><init>(LY2/u$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final b()LY2/x$a;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->F:LY2/x$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->a:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LW2/x;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->I:LW2/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LW2/n$b;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->c:LW2/n$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()LW2/a;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->L:LW2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lc2/n;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->b:Lc2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LW2/x$a;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->d:LW2/x$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()LW2/k;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->f:LW2/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()LY1/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final k()La3/a;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->H:La3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->g:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->z:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/u$a;->G:Z

    .line 2
    .line 3
    return v0
.end method

.method public final o()Lc2/n;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->D:Lc2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()LY2/n;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->h:LY2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->M:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lc2/n;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->m:Lc2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()LW2/x;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->J:LW2/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Lc2/n;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->i:Lc2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()LW2/x$a;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->e:LW2/x$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()LY2/p;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->j:LY2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()LY2/x$a;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->F:LY2/x$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()LY2/q;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->C:LY2/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()I
    .locals 1

    .line 1
    iget v0, p0, LY2/u$a;->E:I

    .line 2
    .line 3
    return v0
.end method

.method public final z()LW2/t;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/u$a;->k:LW2/t;

    .line 2
    .line 3
    return-object v0
.end method
