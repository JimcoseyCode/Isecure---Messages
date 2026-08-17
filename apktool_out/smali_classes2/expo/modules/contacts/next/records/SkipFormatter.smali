.class public final Lexpo/modules/contacts/next/records/SkipFormatter;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u000c\u001a\u00020\tR\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lexpo/modules/contacts/next/records/SkipFormatter;",
        "",
        "fields",
        "",
        "Lexpo/modules/contacts/next/records/fields/ContactField;",
        "<init>",
        "(Ljava/util/Set;)V",
        "formatter",
        "Lexpo/modules/kotlin/records/formatters/Formatter;",
        "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;",
        "format",
        "Lexpo/modules/kotlin/records/formatters/FormattedRecord;",
        "getContactDetailsRecord",
        "expo-contacts_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final fields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lexpo/modules/contacts/next/records/fields/ContactField;",
            ">;"
        }
    .end annotation
.end field

.field private final formatter:Lexpo/modules/kotlin/records/formatters/Formatter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/records/formatters/Formatter<",
            "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lexpo/modules/contacts/next/records/fields/ContactField;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 5
    .line 6
    new-instance p1, Lexpo/modules/contacts/next/records/a;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lexpo/modules/contacts/next/records/a;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lexpo/modules/kotlin/records/formatters/FormatterKt;->formatter(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/Formatter;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter:Lexpo/modules/kotlin/records/formatters/Formatter;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic a(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$20(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$12(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$21(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic d(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$5(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic e(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$22(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic f(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$8(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final formatter$lambda$24(Lexpo/modules/contacts/next/records/SkipFormatter;Lexpo/modules/kotlin/records/formatters/Formatter$Builder;)Li7/B;
    .locals 2

    .line 1
    const-string v0, "$this$formatter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Li7/B;->a:Li7/B;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$1;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$1;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lexpo/modules/contacts/next/records/l;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/l;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 25
    .line 26
    .line 27
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$3;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$3;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lexpo/modules/contacts/next/records/d;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/d;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 39
    .line 40
    .line 41
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$5;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$5;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Lexpo/modules/contacts/next/records/i;

    .line 48
    .line 49
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/i;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 53
    .line 54
    .line 55
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$7;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$7;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Lexpo/modules/contacts/next/records/j;

    .line 62
    .line 63
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/j;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 67
    .line 68
    .line 69
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$9;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$9;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v1, Lexpo/modules/contacts/next/records/k;

    .line 76
    .line 77
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/k;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 81
    .line 82
    .line 83
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$11;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$11;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v1, Lexpo/modules/contacts/next/records/m;

    .line 90
    .line 91
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/m;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 95
    .line 96
    .line 97
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$13;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$13;

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, Lexpo/modules/contacts/next/records/n;

    .line 104
    .line 105
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/n;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 109
    .line 110
    .line 111
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$15;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$15;

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-instance v1, Lexpo/modules/contacts/next/records/o;

    .line 118
    .line 119
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/o;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 123
    .line 124
    .line 125
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$17;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$17;

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    new-instance v1, Lexpo/modules/contacts/next/records/p;

    .line 132
    .line 133
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/p;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 137
    .line 138
    .line 139
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$19;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$19;

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v1, Lexpo/modules/contacts/next/records/q;

    .line 146
    .line 147
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/q;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 151
    .line 152
    .line 153
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$21;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$21;

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    new-instance v1, Lexpo/modules/contacts/next/records/r;

    .line 160
    .line 161
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/r;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 165
    .line 166
    .line 167
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$23;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$23;

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    new-instance v1, Lexpo/modules/contacts/next/records/s;

    .line 174
    .line 175
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/s;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 179
    .line 180
    .line 181
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$25;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$25;

    .line 182
    .line 183
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v1, Lexpo/modules/contacts/next/records/t;

    .line 188
    .line 189
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/t;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 193
    .line 194
    .line 195
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$27;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$27;

    .line 196
    .line 197
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    new-instance v1, Lexpo/modules/contacts/next/records/u;

    .line 202
    .line 203
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/u;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 207
    .line 208
    .line 209
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$29;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$29;

    .line 210
    .line 211
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    new-instance v1, Lexpo/modules/contacts/next/records/v;

    .line 216
    .line 217
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/v;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 221
    .line 222
    .line 223
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$31;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$31;

    .line 224
    .line 225
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    new-instance v1, Lexpo/modules/contacts/next/records/w;

    .line 230
    .line 231
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/w;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 235
    .line 236
    .line 237
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$33;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$33;

    .line 238
    .line 239
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    new-instance v1, Lexpo/modules/contacts/next/records/x;

    .line 244
    .line 245
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/x;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 249
    .line 250
    .line 251
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$35;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$35;

    .line 252
    .line 253
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    new-instance v1, Lexpo/modules/contacts/next/records/y;

    .line 258
    .line 259
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/y;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 263
    .line 264
    .line 265
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$37;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$37;

    .line 266
    .line 267
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    new-instance v1, Lexpo/modules/contacts/next/records/b;

    .line 272
    .line 273
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/b;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 277
    .line 278
    .line 279
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$39;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$39;

    .line 280
    .line 281
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    new-instance v1, Lexpo/modules/contacts/next/records/c;

    .line 286
    .line 287
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/c;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 291
    .line 292
    .line 293
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$41;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$41;

    .line 294
    .line 295
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    new-instance v1, Lexpo/modules/contacts/next/records/e;

    .line 300
    .line 301
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/e;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 305
    .line 306
    .line 307
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$43;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$43;

    .line 308
    .line 309
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    new-instance v1, Lexpo/modules/contacts/next/records/f;

    .line 314
    .line 315
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/f;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 319
    .line 320
    .line 321
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$45;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$45;

    .line 322
    .line 323
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    new-instance v1, Lexpo/modules/contacts/next/records/g;

    .line 328
    .line 329
    invoke-direct {v1, p0}, Lexpo/modules/contacts/next/records/g;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 333
    .line 334
    .line 335
    sget-object v0, Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$47;->INSTANCE:Lexpo/modules/contacts/next/records/SkipFormatter$formatter$1$47;

    .line 336
    .line 337
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    new-instance v0, Lexpo/modules/contacts/next/records/h;

    .line 342
    .line 343
    invoke-direct {v0, p0}, Lexpo/modules/contacts/next/records/h;-><init>(Lexpo/modules/contacts/next/records/SkipFormatter;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;->skip(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    .line 347
    .line 348
    .line 349
    sget-object p0, Li7/B;->a:Li7/B;

    .line 350
    .line 351
    return-object p0
.end method

.method private static final formatter$lambda$24$lambda$0(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->FULL_NAME:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$1(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->GIVEN_NAME:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$10(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->DEPARTMENT:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$11(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->JOB_TITLE:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$12(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->PHONETIC_COMPANY_NAME:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$13(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->IMAGE:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$14(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->THUMBNAIL:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$15(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->NOTE:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$16(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/Boolean;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->IS_FAVOURITE:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$17(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->EMAILS:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$18(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->PHONES:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$19(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->ADDRESSES:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$2(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->MIDDLE_NAME:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$20(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->DATES:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$21(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->RELATIONS:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$22(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->URL_ADDRESSES:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$23(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->EXTRA_NAMES:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$3(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->FAMILY_NAME:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$4(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->PREFIX:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$5(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->SUFFIX:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$6(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->PHONETIC_GIVEN_NAME:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$7(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->PHONETIC_MIDDLE_NAME:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$8(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->PHONETIC_FAMILY_NAME:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method private static final formatter$lambda$24$lambda$9(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->fields:Ljava/util/Set;

    .line 2
    .line 3
    sget-object p1, Lexpo/modules/contacts/next/records/fields/ContactField;->COMPANY:Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0
.end method

.method public static synthetic g(Lexpo/modules/contacts/next/records/SkipFormatter;Lexpo/modules/kotlin/records/formatters/Formatter$Builder;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24(Lexpo/modules/contacts/next/records/SkipFormatter;Lexpo/modules/kotlin/records/formatters/Formatter$Builder;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$0(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic i(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/Boolean;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$16(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/Boolean;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic j(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$11(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic k(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$18(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic l(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$13(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic m(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$17(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic n(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$15(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic o(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$7(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic p(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$23(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic q(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$1(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic r(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$14(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic s(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$9(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic t(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$6(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic u(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$19(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic v(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$2(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic w(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$3(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic x(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$4(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic y(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter$lambda$24$lambda$10(Lexpo/modules/contacts/next/records/SkipFormatter;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final format(Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;",
            ")",
            "Lexpo/modules/kotlin/records/formatters/FormattedRecord<",
            "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "getContactDetailsRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/contacts/next/records/SkipFormatter;->formatter:Lexpo/modules/kotlin/records/formatters/Formatter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/records/formatters/Formatter;->format(Lexpo/modules/kotlin/records/Record;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
