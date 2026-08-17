.class public final LY2/x;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY2/x$a;,
        LY2/x$b;,
        LY2/x$c;,
        LY2/x$d;
    }
.end annotation


# static fields
.field public static final M:LY2/x$b;


# instance fields
.field private final A:I

.field private final B:Z

.field private final C:Z

.field private final D:Z

.field private final E:Z

.field private final F:Z

.field private final G:Z

.field private final H:Z

.field private final I:I

.field private final J:Z

.field private final K:Lh3/f;

.field private final L:Z

.field private final a:Z

.field private final b:Z

.field private final c:Ll2/b;

.field private final d:Z

.field private final e:Z

.field private final f:Z

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:Z

.field private final k:I

.field private final l:Z

.field private final m:Z

.field private final n:LY2/x$d;

.field private final o:Lc2/n;

.field private final p:Z

.field private final q:Z

.field private final r:Lc2/n;

.field private final s:Z

.field private final t:J

.field private final u:Z

.field private final v:Z

.field private final w:Z

.field private final x:Z

.field private final y:Z

.field private final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY2/x$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY2/x$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY2/x;->M:LY2/x$b;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(LY2/x$a;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-boolean v0, p1, LY2/x$a;->c:Z

    iput-boolean v0, p0, LY2/x;->a:Z

    .line 4
    iget-boolean v0, p1, LY2/x$a;->d:Z

    iput-boolean v0, p0, LY2/x;->b:Z

    .line 5
    iget-object v0, p1, LY2/x$a;->e:Ll2/b;

    iput-object v0, p0, LY2/x;->c:Ll2/b;

    .line 6
    iget-boolean v0, p1, LY2/x$a;->f:Z

    iput-boolean v0, p0, LY2/x;->d:Z

    .line 7
    iget-boolean v0, p1, LY2/x$a;->g:Z

    iput-boolean v0, p0, LY2/x;->e:Z

    .line 8
    iget-boolean v0, p1, LY2/x$a;->h:Z

    iput-boolean v0, p0, LY2/x;->f:Z

    .line 9
    iget v0, p1, LY2/x$a;->i:I

    iput v0, p0, LY2/x;->g:I

    .line 10
    iget v0, p1, LY2/x$a;->j:I

    iput v0, p0, LY2/x;->h:I

    .line 11
    iget v0, p1, LY2/x$a;->k:I

    iput v0, p0, LY2/x;->i:I

    .line 12
    iget-boolean v0, p1, LY2/x$a;->l:Z

    iput-boolean v0, p0, LY2/x;->j:Z

    .line 13
    iget v0, p1, LY2/x$a;->m:I

    iput v0, p0, LY2/x;->k:I

    .line 14
    iget-boolean v0, p1, LY2/x$a;->n:Z

    iput-boolean v0, p0, LY2/x;->l:Z

    .line 15
    iget-boolean v0, p1, LY2/x$a;->o:Z

    iput-boolean v0, p0, LY2/x;->m:Z

    .line 16
    iget-object v0, p1, LY2/x$a;->p:LY2/x$d;

    if-nez v0, :cond_0

    new-instance v0, LY2/x$c;

    invoke-direct {v0}, LY2/x$c;-><init>()V

    :cond_0
    iput-object v0, p0, LY2/x;->n:LY2/x$d;

    .line 17
    iget-object v0, p1, LY2/x$a;->q:Lc2/n;

    if-nez v0, :cond_1

    sget-object v0, Lc2/o;->b:Lc2/n;

    const-string v1, "BOOLEAN_FALSE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iput-object v0, p0, LY2/x;->o:Lc2/n;

    .line 18
    iget-boolean v0, p1, LY2/x$a;->r:Z

    iput-boolean v0, p0, LY2/x;->p:Z

    .line 19
    iget-boolean v0, p1, LY2/x$a;->s:Z

    iput-boolean v0, p0, LY2/x;->q:Z

    .line 20
    iget-object v0, p1, LY2/x$a;->t:Lc2/n;

    iput-object v0, p0, LY2/x;->r:Lc2/n;

    .line 21
    iget-boolean v0, p1, LY2/x$a;->u:Z

    iput-boolean v0, p0, LY2/x;->s:Z

    .line 22
    iget-wide v0, p1, LY2/x$a;->v:J

    iput-wide v0, p0, LY2/x;->t:J

    .line 23
    iget-boolean v0, p1, LY2/x$a;->w:Z

    iput-boolean v0, p0, LY2/x;->u:Z

    .line 24
    iget-boolean v0, p1, LY2/x$a;->x:Z

    iput-boolean v0, p0, LY2/x;->v:Z

    .line 25
    iget-boolean v0, p1, LY2/x$a;->y:Z

    iput-boolean v0, p0, LY2/x;->w:Z

    .line 26
    iget-boolean v0, p1, LY2/x$a;->z:Z

    iput-boolean v0, p0, LY2/x;->x:Z

    .line 27
    iget-boolean v0, p1, LY2/x$a;->A:Z

    iput-boolean v0, p0, LY2/x;->y:Z

    .line 28
    iget-boolean v0, p1, LY2/x$a;->B:Z

    iput-boolean v0, p0, LY2/x;->z:Z

    .line 29
    iget v0, p1, LY2/x$a;->C:I

    iput v0, p0, LY2/x;->A:I

    .line 30
    iget-boolean v0, p1, LY2/x$a;->H:Z

    iput-boolean v0, p0, LY2/x;->G:Z

    .line 31
    iget v0, p1, LY2/x$a;->I:I

    iput v0, p0, LY2/x;->I:I

    .line 32
    iget-boolean v0, p1, LY2/x$a;->D:Z

    iput-boolean v0, p0, LY2/x;->B:Z

    .line 33
    iget-boolean v0, p1, LY2/x$a;->E:Z

    iput-boolean v0, p0, LY2/x;->C:Z

    .line 34
    iget-boolean v0, p1, LY2/x$a;->F:Z

    iput-boolean v0, p0, LY2/x;->D:Z

    .line 35
    iget-boolean v0, p1, LY2/x$a;->G:Z

    iput-boolean v0, p0, LY2/x;->E:Z

    .line 36
    iget-boolean v0, p1, LY2/x$a;->b:Z

    iput-boolean v0, p0, LY2/x;->F:Z

    .line 37
    iget-boolean v0, p1, LY2/x$a;->J:Z

    iput-boolean v0, p0, LY2/x;->H:Z

    .line 38
    iget-boolean v0, p1, LY2/x$a;->K:Z

    iput-boolean v0, p0, LY2/x;->J:Z

    .line 39
    iget-object v0, p1, LY2/x$a;->L:Lh3/f;

    iput-object v0, p0, LY2/x;->K:Lh3/f;

    .line 40
    iget-boolean p1, p1, LY2/x$a;->M:Z

    iput-boolean p1, p0, LY2/x;->L:Z

    return-void
.end method

.method public synthetic constructor <init>(LY2/x$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY2/x;-><init>(LY2/x$a;)V

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->L:Z

    .line 2
    .line 3
    return v0
.end method

.method public final B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final C()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->z:Z

    .line 2
    .line 3
    return v0
.end method

.method public final D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->w:Z

    .line 2
    .line 3
    return v0
.end method

.method public final E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->y:Z

    .line 2
    .line 3
    return v0
.end method

.method public final F()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->x:Z

    .line 2
    .line 3
    return v0
.end method

.method public final G()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->s:Z

    .line 2
    .line 3
    return v0
.end method

.method public final H()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public final I()Lc2/n;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/x;->o:Lc2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public final K()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public final L()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->B:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->G:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, LY2/x;->I:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, LY2/x;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, LY2/x;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, LY2/x;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->H:Z

    .line 2
    .line 3
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->v:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->C:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public final m()I
    .locals 1

    .line 1
    iget v0, p0, LY2/x;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final n()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY2/x;->t:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final o()Lh3/f;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/x;->K:Lh3/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()LY2/x$d;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/x;->n:LY2/x$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->E:Z

    .line 2
    .line 3
    return v0
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->D:Z

    .line 2
    .line 3
    return v0
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->F:Z

    .line 2
    .line 3
    return v0
.end method

.method public final t()Lc2/n;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/x;->r:Lc2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()I
    .locals 1

    .line 1
    iget v0, p0, LY2/x;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final w()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY2/x;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final y()Ll2/b;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/x;->c:Ll2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Ll2/b$a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method
