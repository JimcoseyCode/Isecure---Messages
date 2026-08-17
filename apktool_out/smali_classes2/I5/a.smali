.class public final LI5/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI5/a$c;,
        LI5/a$d;,
        LI5/a$b;,
        LI5/a$a;
    }
.end annotation


# static fields
.field private static final p:LI5/a;


# instance fields
.field private final a:J

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:LI5/a$c;

.field private final e:LI5/a$d;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:I

.field private final i:I

.field private final j:Ljava/lang/String;

.field private final k:J

.field private final l:LI5/a$b;

.field private final m:Ljava/lang/String;

.field private final n:J

.field private final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LI5/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, LI5/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LI5/a$a;->a()LI5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, LI5/a;->p:LI5/a;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>(JLjava/lang/String;Ljava/lang/String;LI5/a$c;LI5/a$d;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JLI5/a$b;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, LI5/a;->a:J

    .line 3
    iput-object p3, p0, LI5/a;->b:Ljava/lang/String;

    .line 4
    iput-object p4, p0, LI5/a;->c:Ljava/lang/String;

    .line 5
    iput-object p5, p0, LI5/a;->d:LI5/a$c;

    .line 6
    iput-object p6, p0, LI5/a;->e:LI5/a$d;

    .line 7
    iput-object p7, p0, LI5/a;->f:Ljava/lang/String;

    .line 8
    iput-object p8, p0, LI5/a;->g:Ljava/lang/String;

    .line 9
    iput p9, p0, LI5/a;->h:I

    .line 10
    iput p10, p0, LI5/a;->i:I

    .line 11
    iput-object p11, p0, LI5/a;->j:Ljava/lang/String;

    .line 12
    iput-wide p12, p0, LI5/a;->k:J

    .line 13
    iput-object p14, p0, LI5/a;->l:LI5/a$b;

    .line 14
    iput-object p15, p0, LI5/a;->m:Ljava/lang/String;

    move-wide/from16 p1, p16

    .line 15
    iput-wide p1, p0, LI5/a;->n:J

    move-object/from16 p1, p18

    .line 16
    iput-object p1, p0, LI5/a;->o:Ljava/lang/String;

    return-void
.end method

.method public static p()LI5/a$a;
    .locals 1

    .line 1
    new-instance v0, LI5/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, LI5/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI5/a;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, LI5/a;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, LI5/a;->n:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI5/a;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI5/a;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()LI5/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, LI5/a;->l:LI5/a$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI5/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI5/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()LI5/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, LI5/a;->d:LI5/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI5/a;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, LI5/a;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, LI5/a;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public m()LI5/a$d;
    .locals 1

    .line 1
    iget-object v0, p0, LI5/a;->e:LI5/a$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI5/a;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget v0, p0, LI5/a;->i:I

    .line 2
    .line 3
    return v0
.end method
